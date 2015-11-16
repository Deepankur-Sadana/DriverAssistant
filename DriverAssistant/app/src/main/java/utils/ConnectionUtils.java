package utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

/**
 * UtilConnection is use for internet connection
 *
 */
public class ConnectionUtils {
	/**
	 *
	 * @param context
	 * @return
	 */
	public static boolean isNetAvailable(Context context) {
		boolean isNetAvailable = false;
		if (context != null) {
			ConnectivityManager mgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
			if (mgr != null) {
				boolean mobileNetwork = false;
				boolean wifiNetwork = false;
				boolean wiMaxNetwork = false;
				boolean mobileNetworkConnecetd = false;
				boolean wifiNetworkConnecetd = false;
				boolean wiMaxNetworkConnected = false;
				NetworkInfo mobileInfo = mgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
				NetworkInfo wifiInfo = mgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
				NetworkInfo wiMaxInfo = mgr.getNetworkInfo(ConnectivityManager.TYPE_WIMAX);
				if (mobileInfo != null)
					mobileNetwork = mobileInfo.isAvailable();
				if (wifiInfo != null)
					wifiNetwork = wifiInfo.isAvailable();
				if (wiMaxInfo != null)
					wiMaxNetwork = wiMaxInfo.isAvailable();
				if (wifiNetwork == true || mobileNetwork == true || wiMaxNetwork == true) {
					mobileNetworkConnecetd = mobileInfo.isConnectedOrConnecting();
					wifiNetworkConnecetd = wifiInfo.isConnectedOrConnecting();
					try {
						wiMaxNetworkConnected = wiMaxInfo.isConnectedOrConnecting();
					} catch (Exception e) {
						Log.e("Exception in wifi----->", " : " + e.getMessage());
					}

				}

				/**
				 * If any one of connected means returns true..
				 */
				isNetAvailable = (mobileNetworkConnecetd || wifiNetworkConnecetd || wiMaxNetworkConnected);
				if (!isNetAvailable) {
					Toast.makeText(context, "No Internet Connection", Toast.LENGTH_SHORT).show();
				}

			}
		}
		return isNetAvailable;
	}

	/**
	 *
	 * @param context
	 * @return
	 */
	public static boolean isConnectingToInternet(Context context) {
		ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (connectivity != null) {
			NetworkInfo[] info = connectivity.getAllNetworkInfo();
			if (info != null)
				for (int i = 0; i < info.length; i++)
					if (info[i].getState() == NetworkInfo.State.CONNECTED) {
						return true;
					}

		}
		return false;
	}

	/**
	 *
	 * @param activity
	 * @return
	 */
	public static boolean isNetworkAvailable(Activity activity) {
		ConnectivityManager connectivity = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (connectivity == null) {
			return false;
		} else {
			NetworkInfo[] info = connectivity.getAllNetworkInfo();
			if (info != null) {
				for (int i = 0; i < info.length; i++) {
					if (info[i].getState() == NetworkInfo.State.CONNECTED) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
