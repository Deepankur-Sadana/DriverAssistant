package utils;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.belladati.httpclientandroidlib.HttpEntity;
import com.belladati.httpclientandroidlib.entity.ContentType;
import com.belladati.httpclientandroidlib.entity.mime.MultipartEntityBuilder;
import com.example.deepankur.newproject.BaseActivity;
import com.example.deepankur.newproject.hCareApplication;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import constants.hCareAPIConstants;


/**
 * Created by Neelanjana on 6/23/15.
 */
public class hCareAPIUtils {

	private static hCareApplication sController = hCareApplication.getInstance();

	public static void getMetaData(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.get(hCareAPIConstants.META_DATA, null, params, null, responseListener,
				errorListener);
	}

	public static void signup(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils
				.post(hCareAPIConstants.SIGNUP_API, null, params, responseListener, errorListener);
	}

	public static void login(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils
				.post(hCareAPIConstants.LOGIN_API, null, params, responseListener, errorListener);
	}
	//// TODO:review
	public static void createNewPackage(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils
				.post(hCareAPIConstants.CREATE_NEW_PACKAGE, null, params, responseListener, errorListener);
	}

	public static void facebookLogin(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils
				.post(hCareAPIConstants.FACEBOOK_LOGIN_API, null, params, responseListener, errorListener);
	}

	public static void forgotPassword(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils
				.post(hCareAPIConstants.FORGOT_PASSWORD_API, null, params, responseListener, errorListener);
	}

	public static void otpVerification(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils
				.post(hCareAPIConstants.OTP_VERIFICATION_API, null, params, responseListener,
						errorListener);
	}

	public static void resendOTP(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.get(hCareAPIConstants.RESEND_OTP_API, null, params, null, responseListener,
				errorListener);
	}

	public static void getDoctorData(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.authGet(hCareAPIConstants.GET_DOCTOR, null, params, null, responseListener,
				errorListener);
	}

	public static void registerPatient(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.post(hCareAPIConstants.REGISTER_PATIENT, null, params, null, responseListener, errorListener);
	}

	public static void updatePatient(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.post(hCareAPIConstants.UPDATE_PATIENT, null, params, null, responseListener, errorListener);
	}

	public static void findPatient(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils
				.post(hCareAPIConstants.FIND_PATIENT, null, params, responseListener,
						errorListener);
	}

	public static void verifyPatientOtp(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils
				.post(hCareAPIConstants.VERIFY_PATIENT_OTP, null, params, responseListener,
						errorListener);
	}

	public static void resendPatientOtp(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils
				.post(hCareAPIConstants.RESEND_PATIENT_OTP, null, params, responseListener,
						errorListener);
	}

	public static void changePassword(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.post(hCareAPIConstants.CHANGE_PASSWORD, null, params, responseListener,
				errorListener);
	}

	public static void updatePersonalInfo(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.authPut(hCareAPIConstants.UPDATE_PERSONAL_INFO, null, params, responseListener,
				errorListener);
    }
    
	public static void updateDoctorProfile(String url, String id,Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		//String newurl = String.format(url,id);
		hCareAPIUtils.authPost(url, null, params, responseListener, errorListener);
    }

    public static void deleteDoctorProfile(String url,Map<String, String> params, Response.Listener<JSONObject>
            responseListener, Response.ErrorListener errorListener) {
        hCareAPIUtils.authDelete(url, null, params, null, responseListener, errorListener);
    }

	public static void editDoctorProfile(String url,Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.authPut(url, null, params, null, responseListener, errorListener);
	}

	public static void setMedicalProfile(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.post(hCareAPIConstants.MEDICAL_PROFILE, null, params, responseListener, errorListener);
	}

	public static void setDietPreferences(Map<String, String> params, Response.Listener<JSONObject>
			responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.post(hCareAPIConstants.DIET_PREFERENCE, null, params, responseListener, errorListener);
	}

/*	public static void uplaodProfilePicture(Bitmap mBitmap,
											  MultipartEntityBuilder multiPart,Response.Listener<JSONObject> responseListener,
											  Response.ErrorListener errorListener) {
		if (mBitmap != null) {
			if (mBitmap != null) {
				ByteArrayOutputStream stream = new ByteArrayOutputStream();
				mBitmap.compress(Bitmap.CompressFormat.JPEG, 95, stream);
				byte[] byteArray = stream.toByteArray();
				multiPart.addBinaryBody("picture", byteArray,
						ContentType.create("image/jpeg"), "image.jpg");
			}
			hCareAPIUtils.authPost(hCareAPIConstants.UPLOAD_PROFILE_PICTURE, null,
					makeMap(), multiPart.build(),
					responseListener, errorListener);
		}
	}*/

	public static void jsonPost(String url, JSONObject body, String tag, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
		jsonRequest(Request.Method.POST, url, body, tag, listener, errorListener);
	}

	public static void jsonRequest(int method, String url, JSONObject body, String tag, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
		String path = hCareAPIUtils.urlBuilder(url, null);

		//body.put("token", sController.getAuthToken());
		JsonObjectRequest req =
				new JsonObjectRequest(method, path, body, listener, errorListener) {

					@Override
					public Map<String, String> getHeaders() throws AuthFailureError {
						Map<String, String> header = new HashMap<String, String>();

						if(sController.getAuthToken() != null){
							header.put("Authorization","Bearer" + sController.getAuthToken());
						}
						header.put("X-HCARE-TYPE", "doctor");

						return header;
					}

				};
		req.setRetryPolicy(new DefaultRetryPolicy(hCareAPIConstants.CONNECTION_TIMEOUT_MS,
				DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
				DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
		sController.addToRequestQueue(req, tag);
	}

	private static void request(int method, final String createPath, String tag, final Map<String, String> params, JSONObject jsonObject, final Response.Listener<JSONObject> responseListener, final Response.ErrorListener errorListener) {
		hCareAPIUtils.request(method, createPath, tag, params, null, jsonObject, responseListener,
				errorListener);
	}

	private static void request(int method, final String createPath, String tag, final Map<String, String> params, final HttpEntity entity, JSONObject jsonObject, final Response.Listener<JSONObject> responseListener, final Response.ErrorListener errorListener) {

		if (method != Request.Method.GET && method != Request.Method.POST &&
				method != Request.Method.PUT && method != Request.Method.DELETE) {
			throw new IllegalArgumentException("request method must be either get or post or put");
		}
		if (params == null) {
			throw new IllegalArgumentException("request method requires non null params");
		}

		String builtPath = null;

		if (method == Request.Method.GET || method == Request.Method.DELETE) {
			builtPath = urlBuilder(createPath, params);
		} else if (method == Request.Method.POST || method == Request.Method.PUT) {
			Map<String, String> keyParams = makeMap();
			builtPath = urlBuilder(createPath, keyParams);
		}

		Response.Listener<JSONObject> getResponseListener = new Response.Listener<JSONObject>() {
			@Override
			public void onResponse(JSONObject response) {

				responseListener.onResponse(response);
				Log.d("###", "volley GET response success for Request : " + createPath + " with Params: " + params.toString() + " Response: " + response.toString());
			}
		};

		Response.Listener<String> postResponseListener = new Response.Listener<String>() {
			@Override
			public void onResponse(String stringResponse) {
				try {
					JSONObject response = new JSONObject(stringResponse);
					responseListener.onResponse(response);
					Log.d("###", "volley POST response success for Request : " + createPath + " with Params: " + params.toString() + " Response: " + response.toString());
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Log.d("###", "volley response JSON failure : " + createPath + " with Params: " + params.toString() + " Response: " + stringResponse);
					errorListener.onErrorResponse(new VolleyError(stringResponse));
				}
			}
		};

		Response.ErrorListener customErrorListener = new Response.ErrorListener() {
			@Override
			public void onErrorResponse(VolleyError error) {
				errorListener.onErrorResponse(error);
				Log.d("###", "volley error : " + createPath + " with Params: " + params.toString() + " Error: " + error);
				if (error.toString().contains("UnknownHostException")) {
					if (BaseActivity.getInstance() != null) {
						//	BaseActivity.getInstance().showNoConnectionDialog(createPath);
					}
				}

			}
		};

		if (method == Request.Method.GET || method == Request.Method.DELETE) {


			JsonObjectRequest jsonObjectReq =
					new JsonObjectRequest(method, builtPath, jsonObject, getResponseListener,
							customErrorListener) {

						@Override
						protected Map<String, String> getParams() {
							return params;
						}

						@Override
						public Map<String, String> getHeaders() throws AuthFailureError {
							Map<String, String> header = new HashMap<String, String>();

							if(sController.getAuthToken() != null){
								header.put("Authorization","Bearer" + sController.getAuthToken());
							}
							header.put("X-HCARE-TYPE","doctor");
							return header;
						}
                    };

			jsonObjectReq.setRetryPolicy(
					new DefaultRetryPolicy(hCareAPIConstants.CONNECTION_TIMEOUT_MS,
							DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
							DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
			sController.addToRequestQueue(jsonObjectReq, tag);
		} else if (method == Request.Method.POST && entity != null) {
			StringRequest putReq = new StringRequest(method, builtPath, postResponseListener,
					customErrorListener) {

				@Override
				public String getBodyContentType() {

					return entity.getContentType().getValue();

				}

				@Override
				public byte[] getBody() throws AuthFailureError {
					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					try {
						if (entity != null) {
							entity.writeTo(bos);
						}
					} catch (IOException e) {
						VolleyLog.e("IOException writing to ByteArrayOutputStream");
					}
					return bos.toByteArray();
				}

				@Override
				public Map<String, String> getHeaders() throws AuthFailureError {
					Map<String, String> header = new HashMap<String, String>();
					if(sController.getAuthToken() != null){
						header.put("Authorization","Bearer" + sController.getAuthToken());
					}
					header.put("X-HCARE-TYPE","doctor");
					return header;
				}

            };

			putReq.setRetryPolicy(new DefaultRetryPolicy(hCareAPIConstants.CONNECTION_TIMEOUT_MS,
					DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
					DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
			sController.addToRequestQueue(putReq, tag);
		} else if (method == Request.Method.POST) {
			StringRequest stringReq = new StringRequest(method, builtPath, postResponseListener,
					customErrorListener) {
				@Override
				protected Map<String, String> getParams() {
					return params;
				}

				@Override
				public Map<String, String> getHeaders() throws AuthFailureError {
					Map<String, String> header = new HashMap<String, String>();

					if(sController.getAuthToken() != null){
						header.put("Authorization","Bearer" + sController.getAuthToken());
					}
					header.put("X-HCARE-TYPE","doctor");

					return header;
				}

            };
			stringReq.setRetryPolicy(new DefaultRetryPolicy(hCareAPIConstants.CONNECTION_TIMEOUT_MS,
					DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
					DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
			sController.addToRequestQueue(stringReq, tag);
		} else if (method == Request.Method.PUT && entity != null) {
			StringRequest putReq = new StringRequest(method, builtPath, postResponseListener,
					customErrorListener) {

				@Override
				public String getBodyContentType() {
					if (entity != null) {
						return entity.getContentType().getValue();
					} else {
						return "application/x-www-form-urlencoded";
					}

				}

				@Override
				public byte[] getBody() throws AuthFailureError {
					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					try {
						if (entity != null) {
							entity.writeTo(bos);
						}
					} catch (IOException e) {
						VolleyLog.e("IOException writing to ByteArrayOutputStream");
					}
					return bos.toByteArray();
				}

				@Override
				public Map<String, String> getHeaders() throws AuthFailureError {
					Map<String, String> header = new HashMap<String, String>();

					if(sController.getAuthToken() != null){
						header.put("Authorization","Bearer" + sController.getAuthToken());
					}
					header.put("X-HCARE-TYPE","doctor");

					return header;
				}

            };

			putReq.setRetryPolicy(new DefaultRetryPolicy(hCareAPIConstants.CONNECTION_TIMEOUT_MS,
					DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
					DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
			sController.addToRequestQueue(putReq, tag);
		} else if (method == Request.Method.PUT) {
			StringRequest putReq = new StringRequest(method, builtPath, postResponseListener,
					customErrorListener) {

				@Override
				public Map<String, String> getHeaders() throws AuthFailureError {
					Map<String, String> header = new HashMap<String, String>();

					if(sController.getAuthToken() != null){
						header.put("Authorization","Bearer" + sController.getAuthToken());
					}
					header.put("X-HCARE-TYPE","doctor");

					return header;
				}

                @Override
				protected Map<String, String> getParams() {
					return params;
				}
			};

			putReq.setRetryPolicy(new DefaultRetryPolicy(hCareAPIConstants.CONNECTION_TIMEOUT_MS,
					DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
					DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
			sController.addToRequestQueue(putReq, tag);
		}
	}

	/* get that adds the auth token */
	private static void authGet(String suggestedTopics, String tag, Map<String, String> params, JSONObject jsonObject, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {
		params = params == null ? makeMap() : params;
	//	if (params.get("token") != null) {
			hCareAPIUtils
					.get(suggestedTopics, tag, params, jsonObject, responseListener, errorListener);
	//	}
		// TODO add else statement
	}

	/* Helper method for get requests */
	private static void get(String suggestedTopics, String tag, Map<String, String> params, JSONObject jsonObject, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {

		hCareAPIUtils.request(Request.Method.GET, suggestedTopics, tag, params, jsonObject,
				responseListener, errorListener);
	}

	/* Helper method for post requests */
	private static void authPost(String skipItemPath, String tag, Map<String, String> params, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {
		params = params == null ? makeMap() : params;
		hCareAPIUtils.post(skipItemPath, tag, params, responseListener, errorListener);
	}

	/* Helper method for post requests */
	private static void post(String createPath, String tag, Map<String, String> params, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {

		//// Adding Source Application, Source Platform Supply in all Post API(FGA-2507)
		if (null != params) {
			params.put("params[:source_application] ", "fgx");
			params.put("params[:source_platform] ", "android");
		}
		hCareAPIUtils.request(Request.Method.POST, createPath, tag, params, null, responseListener,
				errorListener);
	}

	/* Helper method for post requests for Image uploads */
	private static void authPost(String path, String tag, Map<String, String> params, HttpEntity body, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {
		params = params == null ? makeMap() : params;
		hCareAPIUtils.post(path, tag, params, body, responseListener, errorListener);
	}

	private static void post(String path, String tag, Map<String, String> params, HttpEntity body, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {

		//// Adding Source Application, Source Platform Supply in all Post API(FGA-2507)
		if (null != params) {

		}
		hCareAPIUtils.request(Request.Method.POST, path, tag, params, body, null, responseListener,
				errorListener);
	}

	/* Helper method for post requests */
	private static void authPut(String path, String tag, Map<String, String> params, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.authPut(path, tag, params, null, responseListener, errorListener);
	}

	/*
	 * call this only in case of image uploads, when multipart is actually
	 * needed. Else call the above
	 */
	private static void authPut(String path, String tag, Map<String, String> params, HttpEntity body, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {
		params = params == null ? makeMap() : params;
		hCareAPIUtils.put(path, tag, params, body, responseListener, errorListener, true);
	}

	/* Helper method for post requests */
	private static void put(String path, String tag, Map<String, String> params, HttpEntity body, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener, boolean isAPIV2) {
		hCareAPIUtils.request(Request.Method.PUT, path, tag, params, body, null, responseListener,
				errorListener);
	}

	/* Helper method for delete requests */
	private static void authDelete(String path, String tag, Map<String, String> params, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {
		hCareAPIUtils.authDelete(path, tag, params, null, responseListener, errorListener);
	}

	/*
	 * call this directly only in case of image uploads, when multipart is
	 * actually needed. Else call the above
	 */
	private static void authDelete(String path, String tag, Map<String, String> params, HttpEntity body, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {
		params = params == null ? makeMap() : params;
		hCareAPIUtils.delete(path, tag, params, body, responseListener, errorListener, true);
	}

	/* Helper method for delete requests */
	private static void delete(String path, String tag, Map<String, String> params, HttpEntity body, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener, boolean isAPIV2) {
		hCareAPIUtils
				.request(Request.Method.DELETE, path, tag, params, body, null, responseListener,
						errorListener);
	}

	/*
	 * Given the type(String) and ids(List), returns a String that you can pass
	 * as a url parameter to fetch
	 */
	private static String getFetchParams(String type, List<Integer> ids) {
		StringBuilder ret = new StringBuilder();
		for (int id : ids) {
			if (ret.length() > 0) {
				ret.append(',');
			}
			ret.append(type + "_" + id);
		}

		return ret.toString();
	}

	private static String getArrayParams(String[] array) {
		String result = "";
		for (int i = 0; i < array.length; i++) {
			result = result + array[i] + ",";
		}
		return result;
	}

	/* Just in case we decide to use another kind of map later */
	private static Map<String, String> makeMap() {
		return new HashMap<String, String>();
	}

	public static String urlBuilder(String createPath, Map<String, String> params) {
		Uri.Builder builder = new Uri.Builder();
		builder.scheme(hCareAPIConstants.DEFAULT_SERVER_LABEL.scheme)
				.encodedAuthority(hCareAPIConstants.DEFAULT_SERVER_LABEL.authority)
				.path(createPath);
		if (params != null) {
			Log.d("# Parameters: ", params.toString());
			for (String key : params.keySet()) {
				if (params.get(key) != null) {
					builder.appendQueryParameter(key, params.get(key));
				} else {
					throw new IllegalArgumentException("params must not contain any null values");
				}
			}
		}
		String ret = builder.build().toString();

		return ret;
	}


}
