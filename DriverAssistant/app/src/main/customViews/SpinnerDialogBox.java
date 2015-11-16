package customViews;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;

import advisor.healthcare.hcaredoctorapp.R;


public class SpinnerDialogBox extends Dialog {

    Context context;

    public SpinnerDialogBox(Context context) {
        super(context);
        this.context = context;
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.requestWindowFeature(android.R.style.Theme_Translucent_NoTitleBar);
        this.setContentView(R.layout.dialog_spinner);
        this.getWindow().setGravity(Gravity.CENTER);
        
        this.getWindow().setBackgroundDrawable(
                new ColorDrawable(Color.TRANSPARENT));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setCancelable(false);
    }

}
