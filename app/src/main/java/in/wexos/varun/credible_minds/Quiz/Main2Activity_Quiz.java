package in.wexos.varun.credible_minds.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import in.wexos.varun.credible_minds.R;
import in.wexos.varun.credible_minds.model.Asp;

public class Main2Activity_Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__quiz);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        Button btnJava = (Button) findViewById(R.id.btnJava);
        btnJava.startAnimation(animation);
        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conceptIntent = new Intent(Main2Activity_Quiz.this, ConceptActivity.class);
                startActivity(conceptIntent);

            }
        });

        Button btnSoftware = (Button) findViewById(R.id.btnSoftware);
        btnSoftware.startAnimation(animation);
        btnSoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent softwareIntent = new Intent(Main2Activity_Quiz.this, Software.class);
                startActivity(softwareIntent);
            }
        });

        Button btnWeb = (Button) findViewById(R.id.btnWeb);
        btnWeb.startAnimation(animation);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Main2Activity_Quiz.this, Web.class);
                startActivity(webIntent);
            }
        });

        Button btnBig_Data = (Button) findViewById(R.id.btnBig_Data);
        btnBig_Data.startAnimation(animation);
        btnBig_Data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Main2Activity_Quiz.this, Big_Data.class);
                startActivity(webIntent);
            }
        });

        Button btnSap = (Button) findViewById(R.id.btnSap);
        btnSap.startAnimation(animation);
        btnSap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Main2Activity_Quiz.this, Sap.class);
                startActivity(webIntent);
            }
        });

        Button btnAsp = (Button) findViewById(R.id.btnAsp);
        btnAsp.startAnimation(animation);
        btnAsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Main2Activity_Quiz.this, Asp.class);
                startActivity(webIntent);
            }
        });


        Button btnOracle = (Button) findViewById(R.id.btnOracle);
        btnOracle.startAnimation(animation);
        btnOracle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Main2Activity_Quiz.this, Oracle.class);
                startActivity(webIntent);
            }
        });


        Button btnDataWare = (Button) findViewById(R.id.btnDataWare);
        btnDataWare.startAnimation(animation);
        btnDataWare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Main2Activity_Quiz.this, Data_WareHouse.class);
                startActivity(webIntent);
            }
        });

        Button btnDevops = (Button) findViewById(R.id.btnDevops);
        btnDevops.startAnimation(animation);
        btnDevops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Main2Activity_Quiz.this, Devops.class);
                startActivity(webIntent);
            }
        });

    }


}