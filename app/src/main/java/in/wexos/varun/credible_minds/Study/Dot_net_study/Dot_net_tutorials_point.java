package in.wexos.varun.credible_minds.Study.Dot_net_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Dot_net_tutorials_point extends AppCompatActivity {

    WebView mwebView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot_net_tutorials_point);

        mwebView3= (WebView)findViewById(R.id.web_dot_net_tutorials_point);
        mwebView3.setWebViewClient(new WebViewClient());
        mwebView3.loadUrl("https://www.tutorialspoint.com/asp.net/");
    }
}
