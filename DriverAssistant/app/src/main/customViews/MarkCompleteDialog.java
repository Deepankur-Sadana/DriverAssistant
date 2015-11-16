package customViews;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import advisor.healthcare.hcaredoctorapp.R;

public class MarkCompleteDialog extends Dialog implements View.OnClickListener {

    public Button okButton;
    public Button cancelButton;
    public Context context;
    boolean isConfirmation = false;

    public MarkCompleteDialog(Context context) {
        super(context);
        this.context = context;
    }

    public MarkCompleteDialog(Context context, boolean isConfirmation) {
        super(context);
        this.context = context;
        this.isConfirmation = isConfirmation;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.mark_complete_dialog);
        //setCanceledOnTouchOutside(false);
        okButton = (Button) findViewById(R.id.mark_complete_btn);
        cancelButton = (Button) findViewById(R.id.mark_complete_cancel);
        okButton.setTag("MARK_COMPLETE");
        if (isConfirmation) {
            cancelButton.setTag("MARK_COMPLETE_CANCEL");
            cancelButton.setVisibility(View.VISIBLE);
        }
        okButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override
    public void onClick(View v) {
        if (isConfirmation) {
            if (v.getTag().toString().equals("MARK_COMPLETE_CANCEL"))
                this.dismiss();
            else {
                this.dismiss();
                onConfirmation();
            }
        } else {
            if (v.getTag().toString().equals("MARK_COMPLETE")) {
                this.dismiss();
            }
        }

    }

    public void onConfirmation() {
    }
}