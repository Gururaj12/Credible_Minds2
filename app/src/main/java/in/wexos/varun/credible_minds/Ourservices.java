package in.wexos.varun.credible_minds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Ourservices extends AppCompatActivity {

    Button website_service, web_development_service, android_service, iphone_service,
            etl_service, testing_service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ourservices);

        website_service = (Button)findViewById(R.id.website_service);
        web_development_service = (Button)findViewById(R.id.web_development_service);
        android_service = (Button)findViewById(R.id.android_service);
        iphone_service = (Button)findViewById(R.id.iphone_service);
        etl_service = (Button)findViewById(R.id.etl_service);
        testing_service = (Button)findViewById(R.id.testing_service);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);

        website_service.startAnimation(animation);
        web_development_service.startAnimation(animation);
        android_service.startAnimation(animation);
        iphone_service.startAnimation(animation);
        etl_service.startAnimation(animation);
        testing_service.startAnimation(animation);

    }
    public void websitedesign(View view){
        Intent intent=new Intent(Ourservices.this,Websitedesign.class);
        startActivity(intent);
    }
    public void website(View view){

        Intent intent=new Intent(Ourservices.this,WebDevelopment.class);
        startActivity(intent);
    }
    public void android(View view){
        Intent intent=new Intent(Ourservices.this,AndroidDevelopment.class);
        startActivity(intent);
    }
    public void iphone(View view){
        Intent intent=new Intent(Ourservices.this,IphoneDevelopment.class);
        startActivity(intent);
    }
    public void informatica(View view){
        Intent intent=new Intent(Ourservices.this,Informatica.class);
        startActivity(intent);
    }

    public void testing(View view){
        Intent intent=new Intent(Ourservices.this,Test.class);
        startActivity(intent);
    }
}


