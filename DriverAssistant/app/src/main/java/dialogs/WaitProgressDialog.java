package dialogs;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

import com.example.deepankur.newproject.R;


public class WaitProgressDialog extends ProgressDialog {
    Context context=null;
    public WaitProgressDialog(Context context) {
        super(context);
        this.context=context;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_dialog);
        setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        setCanceledOnTouchOutside(false);
    }
    int backPressCount=0;
    @Override
    public void onBackPressed() {
    }
}
