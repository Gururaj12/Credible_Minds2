package in.wexos.varun.credible_minds.Study.Java_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Java_tutorials_point extends AppCompatActivity {
    WebView mwebView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_tutorials_point);

        mwebView1= (WebView)findViewById(R.id.web_java_tutorials_point);
        mwebView1.setWebViewClient(new WebViewClient());
        mwebView1.loadUrl("https://www.tutorialspoint.com/java/");
    }
}
