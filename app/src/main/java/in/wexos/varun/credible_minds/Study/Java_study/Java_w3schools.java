package in.wexos.varun.credible_minds.Study.Java_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Java_w3schools extends AppCompatActivity {

    WebView jwebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_w3schools);

        jwebView1= (WebView)findViewById(R.id.web_java_w3school);
        jwebView1.setWebViewClient(new WebViewClient());
        jwebView1.loadUrl("http://www.w3schools.in/java-tutorial/");
    }
}
