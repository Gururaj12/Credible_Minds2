package in.wexos.varun.credible_minds.Study.Oracle_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Oracle_tutorials extends AppCompatActivity {

    WebView jwebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracle_tutorials);

        jwebView1= (WebView)findViewById(R.id.web_oracle_tutorials);
        jwebView1.setWebViewClient(new WebViewClient());
        jwebView1.loadUrl("http://www.oracle-dba-online.com/sql/oracle_sql_tutorial.htm");
    }
}
