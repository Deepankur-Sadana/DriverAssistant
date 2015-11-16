package dialogs;

import android.app.ProgressDialog;
import android.content.Context;

public class ProgressDialogHelper {


    private WaitProgressDialog progressDialog;
    private Context context;

    public ProgressDialogHelper(Context ctx){
        this.context=ctx;
        progressDialog=new WaitProgressDialog(context);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
    }

    public WaitProgressDialog getProgressDialog(){
        if(null==progressDialog){
            progressDialog=new WaitProgressDialog(context);
        }
        return progressDialog;
    }

    public void startProgressDialog(){
        progressDialog.show();
    }

    public void stopProgressDialog(){
        progressDialog.dismiss();
        progressDialog.cancel();
    }

}
