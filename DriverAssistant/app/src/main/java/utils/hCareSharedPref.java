package utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.deepankur.newproject.hCareApplication;

import org.json.JSONException;
import org.json.JSONObject;


import models.MetaDataWrapperModel;

/**
 * Created by Neelanjana on 6/23/15.
 */
public class hCareSharedPref {

	public enum PREF_KEY {
		AUTH_TOKEN("auth_token"), GCM_ID("gcmID"), IS_LOGIN("is_login"),IS_INIT("is_init"),
		SERVER_ADDRESS("server_address"),HC_ID("hcId");

		public final String key;

		PREF_KEY(String key) {
			this.key = key;
		}
	}

	public static void putInt(PREF_KEY key, int value) {
		putInt(hCareApplication.getInstance(), key, value);
	}

	public static int getInt(PREF_KEY key) {
		return getInt(hCareApplication.getInstance(), key);
	}

	public static void putLong(PREF_KEY key, long value) {
		putLong(hCareApplication.getInstance(), key, value);
	}

	public static long getLong(PREF_KEY key) {
		return getLong(hCareApplication.getInstance(), key);
	}

	public static void putString(PREF_KEY key, String value) {
		putString(hCareApplication.getInstance(), key, value);
	}

	public static String getString(PREF_KEY key) {
		return getString(hCareApplication.getInstance(), key);
	}

	public static void putBoolean(PREF_KEY key, boolean value) {
		putBoolean(hCareApplication.getInstance(), key, value);
	}

	public static boolean getBoolean(PREF_KEY key) {
		return getBoolean(hCareApplication.getInstance(), key);
	}

	private static void putInt(Context context, PREF_KEY key, int value) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor editor = sharedPref.edit();
		editor.putInt(key.key, value);

		// Commit the edits!
		editor.commit();
	}

	private static int getInt(Context context, PREF_KEY key) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		int value = sharedPref.getInt(key.key, 0);
		return value;
	}

	private static void putLong(Context context, PREF_KEY key, long value) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor editor = sharedPref.edit();
		editor.putLong(key.key, value);

		// Commit the edits!
		editor.commit();
	}

	private static long getLong(Context context, PREF_KEY key) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		long value = sharedPref.getLong(key.key, 0);
		return value;
	}

	private static void putString(Context context, PREF_KEY key, String value) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor editor = sharedPref.edit();
		editor.putString(key.key, value);
		// Commit the edits!
		editor.commit();
	}

	private static void removeString(Context context, PREF_KEY key) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor editor = sharedPref.edit();
		editor.remove(key.key);
		// Commit the edits!
		editor.commit();
	}

	private static String getString(Context context, PREF_KEY key) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		String value = sharedPref.getString(key.key, null);
		return value;
	}

	private static void putBoolean(Context context, PREF_KEY key, boolean value) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor editor = sharedPref.edit();
		editor.putBoolean(key.key, value);

		// Commit the edits!
		editor.commit();
	}

	private static boolean getBoolean(Context context, PREF_KEY key) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		boolean value = sharedPref.getBoolean(key.key, false);
		return value;
	}

	public static void putString(String key, String value) {
		putString(hCareApplication.getInstance(), key, value);
	}

	private static void putString(Context context, String key, String value) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor editor = sharedPref.edit();
		editor.putString(key, value);

		editor.commit();
	}

	private static String getString(Context context, String key) {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
		String value = sharedPref.getString(key, null);
		return value;
	}

	public static String getString(String key) {
		return getString(hCareApplication.getInstance(), key);
	}

	public static void saveGCMID(String gcmID) {
		hCareSharedPref.putString(hCareSharedPref.PREF_KEY.GCM_ID, gcmID);
	}

	public static String getGetGCMID() {
		return hCareSharedPref.getString(hCareSharedPref.PREF_KEY.GCM_ID);
	}

	public static String getAuthToken() {
		return hCareSharedPref.getString(PREF_KEY.AUTH_TOKEN);
	}

	public static Boolean getIsLogin() {
		return hCareSharedPref.getBoolean(PREF_KEY.IS_LOGIN);
	}

	public static Boolean getIsInit() {
		return hCareSharedPref.getBoolean(PREF_KEY.IS_INIT);
	}

	public static void resetAuthToken() {
		hCareSharedPref.removeString(hCareApplication.getInstance(), PREF_KEY.AUTH_TOKEN);
	}

	public static void saveAuthToken(String token) {
		hCareSharedPref.putString(PREF_KEY.AUTH_TOKEN, token);
	}

	public static void saveIsLogin(Boolean login) {
		hCareSharedPref.putBoolean(PREF_KEY.IS_LOGIN, login);
	}

	public static void saveIsInit(Boolean login) {
		hCareSharedPref.putBoolean(PREF_KEY.IS_INIT, login);
	}

	public static void saveMetaData(JSONObject metaDataObject){
		MetaDataWrapperModel wrapperModel= new MetaDataWrapperModel();
		wrapperModel.setMetaDataString(metaDataObject.toString());
		hCareCacheUtil.writeToInternalStorage(wrapperModel, "metadata");
	}

	public static JSONObject getMetaData(){
		if(hCareCacheUtil.readFromInternalStorage("metadata")!=null) {
			MetaDataWrapperModel wrapperModel= (MetaDataWrapperModel) hCareCacheUtil.readFromInternalStorage("metadata");
			JSONObject object = null;
			try {
				object = new JSONObject(wrapperModel.getMetaDataString());
			} catch (JSONException e) {
				e.printStackTrace();
			}
			return object;
		}
		return null;
	}
	public static void savehcId(String hcId) {
		hCareSharedPref.putString(PREF_KEY.HC_ID, hcId);
	}
	public static String gethcId() {
		return hCareSharedPref.getString(PREF_KEY.HC_ID);
	}

}
