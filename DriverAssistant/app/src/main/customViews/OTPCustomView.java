package customViews;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.RelativeLayout;

import advisor.healthcare.hcaredoctorapp.R;
import robotoViews.RobotoLightEditTextView;

/**
 * Created by Neelanjana on 23/08/15.
 */
public class OTPCustomView extends RelativeLayout {
    private Context context;
    private RobotoLightEditTextView mEditTextView1;
    private RobotoLightEditTextView mEditTextView2;
    private RobotoLightEditTextView mEditTextView3;
    private RobotoLightEditTextView mEditTextView4;

    private StringBuilder otpStringBuilder;

    public OTPCustomView(Context context) {
        super(context);
        init(context);
    }

    public OTPCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public OTPCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public String getOTPString(){
        return this.otpStringBuilder.toString();
    }

    private void init(Context context){
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.layout_otp_alertdialog, this, true);
        mEditTextView1 = (RobotoLightEditTextView) findViewById(R.id.edt_otp_1);
        mEditTextView2 = (RobotoLightEditTextView) findViewById(R.id.edt_otp_2);
        mEditTextView3 = (RobotoLightEditTextView) findViewById(R.id.edt_otp_3);
        mEditTextView4 = (RobotoLightEditTextView) findViewById(R.id.edt_otp_4);

        mEditTextView1.addTextChangedListener(new CustomTextWatcher(mEditTextView1));
        mEditTextView2.addTextChangedListener(new CustomTextWatcher(mEditTextView2));
        mEditTextView3.addTextChangedListener(new CustomTextWatcher(mEditTextView3));
        mEditTextView4.addTextChangedListener(new CustomTextWatcher(mEditTextView4));

        mEditTextView1.requestFocus();
        otpStringBuilder= new StringBuilder();
    }

    private void populateOTPString(){
        otpStringBuilder= new StringBuilder();
        if(mEditTextView1.getText().length()>0){
            otpStringBuilder.append(mEditTextView1.getText());
        }
        if(mEditTextView2.getText().length()>0){
            otpStringBuilder.append(mEditTextView2.getText());
        }
        if(mEditTextView3.getText().length()>0){
            otpStringBuilder.append(mEditTextView3.getText());
        }
        if(mEditTextView4.getText().length()>0){
            otpStringBuilder.append(mEditTextView4.getText());
        }
    }

    private class CustomTextWatcher implements TextWatcher {
        private EditText mEditText;

        public CustomTextWatcher(EditText e) {
            mEditText = e;
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        public void afterTextChanged(Editable s) {
            if(mEditText.equals(mEditTextView1)){
                if(mEditText.getText().length()>0){
                    mEditTextView2.requestFocus();
                }
            }
            if(mEditText.equals(mEditTextView2)){
                if(mEditText.getText().length()>0){
                    mEditTextView3.requestFocus();
                }else{
                    mEditTextView1.requestFocus();
                }
            }
            if(mEditText.equals(mEditTextView3)){
                if(mEditText.getText().length()>0){
                    mEditTextView4.requestFocus();
                }else{
                    mEditTextView2.requestFocus();
                }
            }
            if(mEditText.equals(mEditTextView4)){
                if(mEditText.getText().length()>0){
                    // Uncomment to hide keyboard after last chracter
//                    InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
//                    imm.hideSoftInputFromWindow(mEditTextView4.getWindowToken(), 0);
                }else{
                    mEditTextView3.requestFocus();
                }
            }
            populateOTPString();
        }
    }
}
