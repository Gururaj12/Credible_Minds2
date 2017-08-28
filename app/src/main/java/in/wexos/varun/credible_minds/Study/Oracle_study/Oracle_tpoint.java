package in.wexos.varun.credible_minds.Study.Oracle_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Oracle_tpoint extends AppCompatActivity {

    WebView jwebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracle_tpoint);

        jwebView1= (WebView)findViewById(R.id.web_oracle_tpoint);
        jwebView1.setWebViewClient(new WebViewClient());
        jwebView1.loadUrl("https://www.javatpoint.com/oracle-tutorial");
    }
}
