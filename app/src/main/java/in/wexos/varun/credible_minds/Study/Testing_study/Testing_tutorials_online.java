package in.wexos.varun.credible_minds.Study.Testing_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Testing_tutorials_online extends AppCompatActivity {

    WebView jwebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_tutorials_online);

        jwebView1= (WebView)findViewById(R.id.web_testing_tutorials_online);
        jwebView1.setWebViewClient(new WebViewClient());
        jwebView1.loadUrl("http://toolsqa.com/software-testing/software-testing-tutorial/");

    }
}
