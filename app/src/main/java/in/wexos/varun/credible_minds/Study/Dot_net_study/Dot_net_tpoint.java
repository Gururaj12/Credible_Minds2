package in.wexos.varun.credible_minds.Study.Dot_net_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Dot_net_tpoint extends AppCompatActivity {

    WebView mwebView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot_net_tpoint);

        mwebView2= (WebView)findViewById(R.id.web_dot_net_tpoint);
        mwebView2.setWebViewClient(new WebViewClient());
        mwebView2.loadUrl("https://www.javatpoint.com/c-sharp-tutorial");
    }
}
