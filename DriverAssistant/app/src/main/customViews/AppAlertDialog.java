package customViews;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import advisor.healthcare.hcaredoctorapp.R;

public class AppAlertDialog extends Dialog implements View.OnClickListener{
    public Button okButton;
    public Button cancelButton;
    public Context context;
    public String title = "";
    public String message = "";
    boolean isConfirmation=false;
    public AppAlertDialog(Context context) {
        super(context);
        this.context=context;
    }
    public AppAlertDialog(Context context, boolean isConfirmation) {
        super(context);
        this.context=context;
        this.isConfirmation=isConfirmation;
    }
    public void show(String title, String message){
        this.title = title;
        this.message = message;
        super.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.app_alert_dialog);
        //setCanceledOnTouchOutside(false);
        okButton = (Button)findViewById(R.id.btn_ok);
        cancelButton=(Button)findViewById(R.id.btn_cancel);
        okButton.setTag("OK_BTN");
        if(isConfirmation){
            cancelButton.setTag("CANCEL_BTN");
            cancelButton.setVisibility(View.VISIBLE);
        }
        okButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
        if(this.title!=null && !this.title.isEmpty())
            ((TextView)findViewById(R.id.titleText)).setText(this.title);
        ((TextView)findViewById(R.id.txt_alert_message)).setText(this.message);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override
    public void onClick(View v) {
        if(isConfirmation) {
            if (v.getTag().toString().equals("CANCEL_BTN"))
                this.dismiss();
            else {
                this.dismiss();
                onConfirmation();
            }
        }
        else {
            if (v.getTag().toString().equals("OK_BTN")) {
                this.dismiss();
            }
        }

    }
    public void onConfirmation(){
    }
}