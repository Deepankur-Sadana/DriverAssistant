package components;

import android.content.Context;
import android.os.AsyncTask;

import dialogs.WaitProgressDialog;
import interfaces.KeyIDS;
import listeners.HealthAsynTaskListener;
import models.Params;

public class HealthAsynTask extends AsyncTask<Params, String, String> implements KeyIDS {

    private Context context;
    private boolean isDialog;
    private HealthAsynTaskListener taskListener;
    private int timeOut = 30000;
    private String httpMethod;
    private WaitProgressDialog dialog;

    public HealthAsynTask(Context context, boolean isDialog, String httpMethod, HealthAsynTaskListener taskListener) {
        this.context = context;
        this.isDialog = isDialog;
        this.httpMethod = httpMethod;
        this.taskListener = taskListener;
    }
    public HealthAsynTask(Context context, boolean isDialog, String httpMethod, HealthAsynTaskListener taskListener, int timeOut) {
        this.context = context;
        this.isDialog = isDialog;
        this.taskListener = taskListener;
        this.timeOut = timeOut;
    }

    @Override
    protected void onPreExecute() {
        if(isDialog) {
            dialog = new WaitProgressDialog(context);
            taskListener.onPreExecute(dialog);
        }
    }
    @Override
    protected String doInBackground(Params... args) {
        if(httpMethod.equals("get")) {
            return ServerCommunication.server().getHealthGetData(args[0].getUrl(), args[0].getParams(), timeOut);
        }
        else if (httpMethod.equals("put")) {
            return ServerCommunication.server().getHealthPutData(args[0].getUrl(), args[0].getParams(), timeOut);
        }
        else if(httpMethod.equals("delete")) { return "";}
        else{
            return ServerCommunication.server().getHealthPostData(args[0].getUrl(), args[0].getParams(), timeOut);
        }
    }
    @Override
    protected void onPostExecute(String result) {
        try {
            if (dialog != null && isDialog) {
                dialog.dismiss();
                dialog.cancel();
            }
        taskListener.onPostExecute(result);
    }catch(Exception e) {
            if (dialog.isShowing()) {
                dialog.dismiss();
                dialog.cancel();
            }
        }
    }
}

