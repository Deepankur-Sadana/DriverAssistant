package consumer;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

import java.io.File;
import java.util.Map;

/**
 * <p/>
 * (Singleton) Consumer Class for Consuming REST API in an encapsulated manner.
 * Uses Gson at core for making Object specific calls.
 */
public class Consumer extends Application {

    private static Consumer mInstance;
    private RequestQueue requestQueue;
    private ImageLoader mImageLoader;
    private static Context mCtx;

    /**
     * Private Sinleton constructor.
     *
     * @param context
     */
    private Consumer(Context context) {
        mCtx = context;

        requestQueue = getRequestQueue();

        mImageLoader = new ImageLoader(requestQueue,
                new ImageLoader.ImageCache() {
                    private final LruCache<String, Bitmap>
                            cache = new LruCache<String, Bitmap>(20);

                    @Override
                    public Bitmap getBitmap(String url) {
                        return cache.get(url);
                    }

                    @Override
                    public void putBitmap(String url, Bitmap bitmap) {
                        cache.put(url, bitmap);
                    }
                });
    }

    /**
     * Gets the singleton instance of the Consumer.
     *
     * @param context The Application Context.
     * @return Consumer
     */
    public static synchronized Consumer getInstance(Context context) {

        if (mInstance == null) {
            mInstance = new Consumer(context);
        }
        return mInstance;
    }

    /**
     * Gets the request queue.
     *
     * @return RequestQueue
     */
    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            //GetApplicationContext to maintain a single queue in whole application.
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return requestQueue;
    }

    /**
     * Add a request to the volley request queue.
     *
     * @param req
     * @param <T>
     */
    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

    /**
     * Getting the Image Loader.
     *
     * @return ImageLoader
     */
    public ImageLoader getImageLoader() {
        return mImageLoader;
    }


    /**
     * GET Http Request using Gson.
     *
     * @param url              the url to hit
     * @param clazz            the class of response type
     * @param responseListener the response listener
     * @param errorListener    the error listener
     * @param <T>              the reponse class template generic
     */
    public <T> void get(String url, Boolean byPass, Class<T> clazz, Response.Listener<T> responseListener, Response.ErrorListener errorListener) {

        GsonRequest<T> myReq = new GsonRequest<T>(
                Request.Method.GET,
                url,
                byPass,
                clazz,
                responseListener,
                errorListener);

        this.getRequestQueue().add(myReq);
    }

    /**
     * POST Http Request using Gson.
     *
     * @param url              the url to hit
     * @param params           The post parameters.
     * @param clazz            the class of response type
     * @param responseListener the response listener
     * @param errorListener    the error listener
     * @param <T>              the reponse class template generic
     */
    public <T> void post(String url, Boolean byPass, Map<String, String> params, Class<T> clazz, Response.Listener<T> responseListener, Response.ErrorListener errorListener) {

        GsonRequest<T> myReq = new GsonRequest<T>(
                Request.Method.POST,
                url,
                byPass,
                clazz,
                params,
                responseListener,
                errorListener);

        this.getRequestQueue().add(myReq);
    }

    /**
     * PUT Http Request using Gson.
     *
     * @param url              the url to hit
     * @param params           The post parameters.
     * @param clazz            the class of response type
     * @param responseListener the response listener
     * @param errorListener    the error listener
     * @param <T>              the reponse class template generic
     */
    public <T> void put(String url, Boolean byPass, Map<String, String> params, Class<T> clazz, Response.Listener<T> responseListener, Response.ErrorListener errorListener) {

        GsonRequest<T> myReq = new GsonRequest<T>(
                Request.Method.PUT,
                url,
                byPass,
                clazz,
                params,
                responseListener,
                errorListener);

        this.getRequestQueue().add(myReq);
    }

    /**
     * GET Http Request using Gson.
     *
     * @param url              the url to hit
     * @param clazz            the class of response type
     * @param responseListener the response listener
     * @param errorListener    the error listener
     * @param <T>              the reponse class template generic
     */
    public <T> void delete(String url, Boolean byPass, Class<T> clazz, Response.Listener<T> responseListener, Response.ErrorListener errorListener) {

        GsonRequest<T> myReq = new GsonRequest<T>(
                Request.Method.DELETE,
                url,
                byPass,
                clazz,
                responseListener,
                errorListener);

        this.getRequestQueue().add(myReq);
    }

/*    public <T> void multiPartRequest(String url, Boolean byPass, Map<String, File> fileMap, Map<String, String> params, Class<T> clazz, Response.Listener<T> responseListener, Response.ErrorListener errorListener) {
        MultiPartRequest<T> multiPartRequest = new MultiPartRequest<T>(
                url,
                byPass,
                errorListener,
                clazz,
                responseListener,
                fileMap,
                params);

        multiPartRequest.setRetryPolicy(new DefaultRetryPolicy(ConsumerAPIConstants.MULTIPART_TIMEOUT, ConsumerAPIConstants.MAX_RETRIES, 1));
        this.getRequestQueue().add(multiPartRequest);
    }*/
}
