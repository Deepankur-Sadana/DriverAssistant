package com.example.deepankur.newproject;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LruCache;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

import utils.hCareSharedPref;


public class hCareApplication extends Application {


	public static final String TAG = "VolleyPatterns";
	private RequestQueue mRequestQueue;
	private ImageLoader mImageLoader;
	private static hCareApplication sInstance;
	private static Context context;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		sInstance = this;

		context = getApplicationContext();
		//	FacebookSdk.sdkInitialize(getApplicationContext());
	}


	public static Context getContext() {
		return context;
	}

	public static synchronized hCareApplication getInstance() {
		return sInstance;
	}

	public String getAuthToken() {
		return hCareSharedPref.getString(hCareSharedPref.PREF_KEY.AUTH_TOKEN);
	}

	public RequestQueue getRequestQueue() {
		// lazy initialize the request queue, the queue instance will be
		// created when it is accessed for the first time
		if (mRequestQueue == null) {
			mRequestQueue = Volley.newRequestQueue(getApplicationContext());
		}
		return mRequestQueue;
	}

	public ImageLoader getImageLoader() {
		if (mImageLoader == null) {
			mImageLoader = new ImageLoader(getRequestQueue(), new ImageLoader.ImageCache() {
				private final LruCache<String, Bitmap> mCache = new LruCache<String, Bitmap>(20);

				@Override
				public void putBitmap(String url, Bitmap bitmap) {
					mCache.put(url, bitmap);
				}

				@Override
				public Bitmap getBitmap(String url) {
					return mCache.get(url);
				}
			});
		}

		return mImageLoader;
	}

	public <T> void addToRequestQueue(Request<T> req, String tag) {
		// set the default tag if tag is empty
		req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);

		VolleyLog.d("Adding request to queue: %s", req.getUrl());

		getRequestQueue().add(req);
	}

	public <T> void addToRequestQueue(Request<T> req) {
		// set the default tag if tag is empty
		req.setTag(TAG);

		getRequestQueue().add(req);
	}

	public void cancelPendingRequests(Object tag) {
		if (mRequestQueue != null) {
			mRequestQueue.cancelAll(tag);
		}
	}

}
