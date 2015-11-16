package fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.example.deepankur.newproject.R;

/**
 * Created by deepankur on 07-11-2015.
 */
public class CorporateCardFragment extends Fragment {
    private ProgressBar progress;

    public CorporateCardFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.corparate_card, container, false);



        return view;
    }
    private class MyClient extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            setValue(newProgress);

            super.onProgressChanged(view, newProgress);
        }
    }
    public void setValue(int progress) {
        this.progress.setProgress(progress);
    }


}
