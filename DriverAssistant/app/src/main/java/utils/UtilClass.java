package utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.FragmentManager;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;


import com.example.deepankur.newproject.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


import handlers.PrefDataHandler;

/**
 * Created by sumanta on 9/5/15.
 */
public class UtilClass {
    public static CharacterDrawable getDefaultProfile() {
        return CharacterDrawable.getDrawable(PrefDataHandler.getPrefDataHandler().getSharedPref().getString("name",""));
    }

    public static CharacterDrawable getDefaultProfileByName(String name) {
        return CharacterDrawable.getDrawable(name);
    }
    public static Bitmap getDefaultImage(Context context) {
        //todo default patient pic
        Bitmap resized = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), R.mipmap.amdimage), 100, 100, false);
        return resized;
    }

    public static void clearBackStack(FragmentManager manager) {
        if (manager.getBackStackEntryCount() > 0) {
            FragmentManager.BackStackEntry first = manager.getBackStackEntryAt(0);
            manager.popBackStack(first.getId(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
    }

    public static boolean isConnectingToInternet(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED)
                        return true;

        }
        return false;
    }

    public static int getDIP(Context context, int value) {
        Resources r = context.getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, r.getDisplayMetrics());
        return px;
    }

    public static String encodeTobase64(Bitmap image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        String imageEncoded = Base64.encodeToString(b, Base64.DEFAULT);
        return imageEncoded;
    }

    public static Bitmap decodeBase64(String input) {
        byte[] decodedByte = Base64.decode(input, 0);
        return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
    }

  /*  public static void registerSMSReceiver (Context context, BroadcastReceiver receiver) {
        if(!HealthSmsReceiver.isReceiverRegister) {
            HealthSmsReceiver.isReceiverRegister = true;
            context.registerReceiver(receiver, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        }
    }

    public static void unRegisterSMSReceiver (Context context, BroadcastReceiver receiver) {
        if(HealthSmsReceiver.isReceiverRegister) {
            HealthSmsReceiver.isReceiverRegister = false;
            context.unregisterReceiver(receiver);
        }
    }*/

    public static ArrayList<String> getAllJsonKeys(JSONObject jsonObject) {
        ArrayList<String> keyList = new ArrayList<String>();
        Iterator<?> keys = jsonObject.keys();
        while( keys.hasNext() ){
            keyList.add((String)keys.next());
        }
        Collections.sort(keyList);
        return keyList;
    }

    public static String loadJSONFromAsset(Activity activity,String fileName) {
        String json = null;
        try {
            InputStream is = activity.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

}
