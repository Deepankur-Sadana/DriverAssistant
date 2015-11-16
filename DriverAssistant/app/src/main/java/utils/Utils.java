package utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import com.example.deepankur.newproject.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import constants.hCareConstants;
import models.DoctorInformationModel;
import models.MetaDataModel;

/**
 * Created by Neelanjana on 6/24/15.
 */
public class Utils {
    private static String TAG="Utils";

    public static Bitmap getDefaultImage(Context context) {
	//	Bitmap resized = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), R.mipmap.default_patient_pic), 100, 100, false);
		Bitmap resized =null;
			return resized;
	}

	public static MetaDataModel metaDataModel;

	public static MetaDataModel getMetaDataModel() {
		return metaDataModel;
	}

	public static void setMetaDataModel(MetaDataModel metaDataModel) {
		Utils.metaDataModel = metaDataModel;
	}

	public static boolean checkStatus(JSONObject response){

		int status = response.optInt("status");
        return status == 200;

    }

	public static String getSucessMessage(JSONObject response){
		String successMsg= response.optString("message");
		if(successMsg==null){
			successMsg= "Successful";
		}
		return successMsg;
	}

	public static String getErrorMessage(Context context,JSONObject response){
		JSONObject errors = response.optJSONObject("errors");
		JSONArray errorMsg = errors.optJSONArray("combined");
		String msg = "";
		for(int i=0;i<errorMsg.length();i++){
			msg = msg+" " + errorMsg.optString(i);
		}
		if(msg.trim().isEmpty())
			//return context.getResources().getString(R.string.generic_error_message);
		return "Error 404 test";
		else
			return msg;
	}

	public static DoctorInformationModel getUserProfile() {
		DoctorInformationModel model = (DoctorInformationModel) hCareCacheUtil
				.readFromInternalStorage(hCareConstants.USER_MODEL_CACHE_OBJ);
		return model;
	}

	public static void saveUserProfile(DoctorInformationModel model) {
		hCareCacheUtil.writeToInternalStorage(model,
				hCareConstants.USER_MODEL_CACHE_OBJ);
	}

	public static boolean isStringNumber(String s) throws Exception {
		boolean result = false;
		byte[] bytes = s.getBytes("ASCII");
		int tmp, i = bytes.length;
		while (i >0  && (result = ((tmp = bytes[--i] - '0') >= 0) && tmp <= 9));
		return result;
	}

	/*public static void logOutUser(){
		hCareSharedPref.saveAuthToken(null);
        hCareSharedPref.resetAuthToken();
		Log.v(TAG, "Logging out doc.");
		ChatService.getInstance().logoutFromChat();
		ChatService.getInstance().stopSelf();
        MainActivity.getInstance().switchActivity(LoginActivity.class);
	}*/

	public static void isTextEmpty(TextView textView, String text){
		if(text.trim().isEmpty())
			textView.setVisibility(View.GONE);
		else
			textView.setText(text);
	}

	public static ArrayList<String> getAllOrderedValues(HashMap<String, String> map){
		Iterator it = map.entrySet().iterator();
		ArrayList<String> list= new ArrayList<String>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			list.add(pair.getValue().toString());
//			it.remove(); // avoids a ConcurrentModificationException
		}
		return list;
	}

	public static ArrayList<String> getAllOrderedKeys(HashMap<String, String> map){
		Iterator it = map.entrySet().iterator();
		ArrayList<String> list= new ArrayList<String>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			list.add(pair.getKey().toString());
		}
		return list;
	}

	public static String getKeyForValue(HashMap<String, String> map, String value){
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if(pair.getValue().toString().equalsIgnoreCase(value)){
				hCareLog.d("###","Key found");
				return pair.getKey().toString();
			}
		}
		hCareLog.d("###","Key not found");
		return null;
	}

	public static JSONArray getCitiesForState(JSONObject state, JSONArray stateList){
		for(int i=0; i<stateList.length(); i++){
			try {
				JSONObject object= (JSONObject)stateList.get(i);
				if(object.opt("id")!=null) {
					if (object.opt("id").toString().equalsIgnoreCase(state.opt("id").toString())) {
						if(object.opt("cities")!=null) {
							return (JSONArray) object.opt("cities");
						}
					}
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * get values in dp from pixels
	 * @param context
	 * @param value
	 * @return
	 */
	public static int getDIP(Context context, int value) {
		Resources r = context.getResources();
		int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, r.getDisplayMetrics());
		return px;
	}

	/**
	 * convert date format from "yyyy-MM-dd hh:mm:ss" to "dd/MM/yyyy"
	 * @param dates
	 * @return
	 */
	public static String convertDate(String dates) {
		String input = dates;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		DateFormat outputformat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		String output = null;
		try {
			//Converting the input String to Date
			date = df.parse(input);
			//Changing the format of date and storing it in String
			output = outputformat.format(date);
			//Displaying the date
			//System.out.println(output);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return output;
	}

	public static ArrayList<String> getAllJsonKeys(JSONObject jsonObject) {
		ArrayList<String> keyList = new ArrayList<String>();
		Iterator<?> keys = jsonObject.keys();
		while( keys.hasNext() ){
			keyList.add((String)keys.next());
		}
		Collections.sort(keyList);
		return keyList;
	}

}
