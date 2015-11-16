package consumer;


import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;



public class GsonRequest<T> extends Request<T> {
    private Gson mGson = new Gson();
    private Class<T> clazz;
    private Map<String, String> headers;
    private Map<String, String> params;
    private Listener<T> listener;

    /**
     * Make a GET,DELETE request and return a parsed object from JSON.
     *
     * @param url   URL of the request to make
     * @param clazz Relevant class object, for Gson's reflection
     */
    public GsonRequest(int method,
                       String url,
                       Boolean byPass,
                       Class<T> clazz,
                       Listener<T> listener,
                       ErrorListener errorListener) {

        super(method, url, errorListener);
        this.clazz = clazz;
        this.listener = listener;
        this.headers = makeHeaders(byPass);
        mGson = new Gson();
    }

    /**
     * Make a POST,PUT request and return a parsed object from JSON.
     *
     * @param url   URL of the request to make
     * @param clazz Relevant class object, for Gson's reflection
     */
    public GsonRequest(int method,
                       String url,
                       Boolean byPass,
                       Class<T> clazz,
                       Map<String, String> params,
                       Listener<T> listener,
                       ErrorListener errorListener) {

        super(method, url, errorListener);
        this.clazz = clazz;
        this.params = params;
        this.listener = listener;
        this.headers = makeHeaders(byPass);

        mGson = new Gson();
    }

 /*   private static String appendToken(String url,Boolean byPass) {
        if(!byPass){
            String TOKEN = PrefDataHandler.getPrefDataHandler().getSharedPref().getString("token", null);
            url+=ConsumerAPIConstants.TOKEN_URL_PARAM+TOKEN;
        }
        return url;
    }*/

    /**
     * Make Headers by Fetching the Token.
     * @param byPass To specify token bypass
     * @return map headers.
     */
    private Map<String, String> makeHeaders(Boolean byPass) {
        Map<String, String> headers = new HashMap<>();
        headers.put(ConsumerAPIConstants.HCARE_TYPE_HEADER_KEY, ConsumerAPIConstants.HCARE_TYPE);

        if (!byPass) {
            String TOKEN ="";
            //// TODO: 09-11-2015
            headers.put(ConsumerAPIConstants.AUTHORIZATION_HEADER_KEY, ConsumerAPIConstants.BEARER_PREFIX + TOKEN);
        }
        return headers;
    }



    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        return headers != null ? headers : super.getHeaders();
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }

    @Override
    protected void deliverResponse(T response) {
        listener.onResponse(response);
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String json = new String(
                    response.data, HttpHeaderParser.parseCharset(response.headers));
            return Response.success(
                    mGson.fromJson(json, clazz), HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JsonSyntaxException e) {
            return Response.error(new ParseError(e));
        }

    }
}
