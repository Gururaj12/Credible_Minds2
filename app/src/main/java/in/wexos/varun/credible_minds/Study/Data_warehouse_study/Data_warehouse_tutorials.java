package in.wexos.varun.credible_minds.Study.Data_warehouse_study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import in.wexos.varun.credible_minds.R;


public class Data_warehouse_tutorials extends AppCompatActivity {

    WebView mwebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_warehouse_tutorials);

        mwebView1= (WebView)findViewById(R.id.web_data_tutorials);
        mwebView1.setWebViewClient(new WebViewClient());
        mwebView1.loadUrl("https://intellipaat.com/tutorial/data-warehouse-tutorial/");
    }
}
