package dummy;

import android.content.Context;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import components.HealthAsynTask;
import components.ServerCommunication;
import dialogs.WaitProgressDialog;
import listeners.HealthAsynTaskListener;
import models.Params;

/**
 * Created by deepankur on 13-11-2015.
 */
public class dummy {
    Context context;
    String r = "";

    private void getWaterGraphData() {


        HealthAsynTaskListener listener = new HealthAsynTaskListener() {
            @Override
            public void onPreExecute(WaitProgressDialog dialog) {

            }

            private void asd() {

            }

            @Override
            public void onPostExecute(String result) {
                if (!result.isEmpty()) {
                    try {
                        JSONObject resultObject = new JSONObject(result);
                        if (resultObject.getInt("status") == 200) {
                            JSONObject dataObject = resultObject.getJSONObject("data");


                        } else {

                        }
                    } catch (JSONException e) {

                        e.printStackTrace();
                    }
                }
            }
        };
        Params params = new Params(ServerCommunication.server().getActionUrl(r), null);
        HealthAsynTask asynTask = new HealthAsynTask(context, true, "get", listener);
        asynTask.execute(params);
    }
}
