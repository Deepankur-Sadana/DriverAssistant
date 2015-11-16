package fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.deepankur.newproject.R;

/**
 * Created by deepankur on 07-11-2015.
 */
public  class OPenWeb extends Fragment {
    private ProgressBar progress;
    public OPenWeb() {
        // Empty constructor required for fragment subclasses
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_health_tips, container, false);

        final WebView webview = (WebView) view.findViewById(R.id.webviewBlog);
        webview.setWebViewClient(new WebViewClient());
        webview.setWebChromeClient(new MyClient());
        progress = (ProgressBar) view.findViewById(R.id.progressBarBlog);
        progress.setMax(100);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setVisibility(View.VISIBLE);
        progress.setProgress(0);
        webview.loadUrl("http://productrx.com/");
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
