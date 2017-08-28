package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


import in.wexos.varun.credible_minds.R;

public class MainActivity_Study extends AppCompatActivity {

    CardView
            cardview_java_study,
            cardview_testing_study,
            cardview_web_technology_study,
            cardview_dot_net_study,
            cardview_big_data_study,
            cardview_sap_study,
            cardview_oracle_study,
            cardview_data_warehouse_study,
            cardview_java_script_study;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__study);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);


        cardview_java_study = (CardView)findViewById(R.id.cardview_java_study);
        cardview_testing_study = (CardView)findViewById(R.id.cardview_software_study);
        cardview_web_technology_study = (CardView)findViewById(R.id.cardview_web_technology_study);
        cardview_dot_net_study = (CardView)findViewById(R.id.cardview_asp_net_study);
        cardview_big_data_study = (CardView)findViewById(R.id.cardview_big_data_study);
        cardview_sap_study = (CardView)findViewById(R.id.cardview_sap_study);
        cardview_oracle_study = (CardView)findViewById(R.id.cardview_oracle_study);
        cardview_data_warehouse_study = (CardView)findViewById(R.id.cardview_data_warehouse_study);
        cardview_java_script_study = (CardView)findViewById(R.id.cardview_java_script_study);

        cardview_java_study.startAnimation(animation);
        cardview_testing_study.startAnimation(animation);
        cardview_web_technology_study.startAnimation(animation);
        cardview_dot_net_study.startAnimation(animation);
        cardview_big_data_study.startAnimation(animation);
        cardview_sap_study.startAnimation(animation);
        cardview_oracle_study.startAnimation(animation);
        cardview_data_warehouse_study.startAnimation(animation);
        cardview_java_script_study.startAnimation(animation);

        cardview_java_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Study.this, Java_Study.class);
                startActivity(intent);
            }
        });

        cardview_testing_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Study.this, Testing_Study.class);
                startActivity(intent);
            }
        });

        cardview_web_technology_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Study.this, Web_Technology_Study.class);
                startActivity(intent);
            }
        });


        cardview_dot_net_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Study.this, Dot_net_Study.class);
                startActivity(intent);
            }
        });

        cardview_big_data_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Study.this, Big_Data_Study.class);
                startActivity(intent);
            }
        });

        cardview_sap_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Study.this, Sap_Study.class);
                startActivity(intent);
            }
        });

        cardview_oracle_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Study.this, Oracle_Study.class);
                startActivity(intent);
            }
        });

        cardview_data_warehouse_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Study.this, Data_warehouse_Study.class);
                startActivity(intent);
            }
        });

        cardview_java_script_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Study.this, Java_Script.class);
                startActivity(intent);
            }
        });

    }
}

