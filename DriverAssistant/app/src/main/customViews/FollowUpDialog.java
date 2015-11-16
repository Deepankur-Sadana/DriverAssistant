package customViews;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import advisor.healthcare.hcaredoctorapp.R;

public class FollowUpDialog extends Dialog implements View.OnClickListener {

    public Button okButton;
    public Button cancelButton;
    public Context context;
    public String message;
    boolean isConfirmation = false;

    public FollowUpDialog(Context context) {
        super(context);
        this.context = context;
    }

    public FollowUpDialog(Context context, boolean isConfirmation) {
        super(context);
        this.context = context;
        this.isConfirmation = isConfirmation;
    }

    public void show(String message){
        this.message = message;
        super.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.follow_up_dialog);
        //setCanceledOnTouchOutside(false);
        okButton = (Button) findViewById(R.id.follow_up_btn);
        cancelButton = (Button) findViewById(R.id.follow_up_cancel);
        okButton.setTag("FOLLOW_UP");
        if (isConfirmation) {
            cancelButton.setTag("FOLLOW_UP_CANCEL");
            cancelButton.setVisibility(View.VISIBLE);
        }
        okButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
        ((TextView)findViewById(R.id.follow_up_message)).setText(this.message);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override
    public void onClick(View v) {
        if (isConfirmation) {
            if (v.getTag().toString().equals("FOLLOW_UP_CANCEL"))
                this.dismiss();
            else {
                this.dismiss();
                onConfirmation();
            }
        } else {
            if (v.getTag().toString().equals("FOLLOW_UP")) {
                this.dismiss();
            }
        }

    }

    public void onConfirmation() {
    }
}