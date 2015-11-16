package handlers;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.deepankur.newproject.hCareApplication;


public class PrefDataHandler {
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    private static PrefDataHandler prefDataHandler=null;
    private PrefDataHandler() {
        sharedPref = hCareApplication.getContext().getSharedPreferences("healthPre", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
    }
    public static PrefDataHandler getPrefDataHandler() {
        if(prefDataHandler == null)
            prefDataHandler = new PrefDataHandler();
        return prefDataHandler;
    }



    public SharedPreferences.Editor getEditor() {
        return editor;
    }
    public SharedPreferences getSharedPref() {
        return sharedPref;
    }


}
