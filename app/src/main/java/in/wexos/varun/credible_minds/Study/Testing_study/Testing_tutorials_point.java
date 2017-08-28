package in.wexos.varun.credible_minds.Study.Testing_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Testing_tutorials_point extends AppCompatActivity {

    WebView jwebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_tutorials_point);

        jwebView1= (WebView)findViewById(R.id.web_testing_tutorials_point);
        jwebView1.setWebViewClient(new WebViewClient());
        jwebView1.loadUrl("http://www.tutorialspoint.com/software_testing/");

    }
}
