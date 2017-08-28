package in.wexos.varun.credible_minds.Study.Big_data_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Big_tutorials_point extends AppCompatActivity {

    WebView mwebView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_tutorials_point);

        mwebView3= (WebView)findViewById(R.id.web_big_data_tutorials_point);
        mwebView3.setWebViewClient(new WebViewClient());
        mwebView3.loadUrl("https://www.tutorialspoint.com/hadoop/hadoop_big_data_overview.htm");
    }
}
