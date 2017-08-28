package in.wexos.varun.credible_minds.Study.Java_script_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class JavaScript_w3school extends AppCompatActivity {

    WebView jwebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_script_w3school);

        jwebView1= (WebView)findViewById(R.id.web_java_script_w3school);
        jwebView1.setWebViewClient(new WebViewClient());
        jwebView1.loadUrl("https://www.w3schools.com/js/");


    }
}
