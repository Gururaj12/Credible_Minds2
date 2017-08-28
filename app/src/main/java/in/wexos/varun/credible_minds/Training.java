package in.wexos.varun.credible_minds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import in.wexos.varun.credible_minds.Training_terms.Big_training;
import in.wexos.varun.credible_minds.Training_terms.Data_warehouse_training;
import in.wexos.varun.credible_minds.Training_terms.Java_training;
import in.wexos.varun.credible_minds.Training_terms.Microsoft_training;
import in.wexos.varun.credible_minds.Training_terms.Oracle_training;
import in.wexos.varun.credible_minds.Training_terms.Sap_training;
import in.wexos.varun.credible_minds.Training_terms.Testing_training;
import in.wexos.varun.credible_minds.Training_terms.Web_training;

public class Training extends AppCompatActivity {

    Button button_see_java, button_see_testing, button_see_web, button_see_big_data,
            button_see_sap, button_see_microsoft, button_see_oracle, button_see_data_warehouse,
    java_query,testing_query,web_query,big_query,sap_query, microsoft_query,oracle_query,
            data_query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        button_see_java = (Button)findViewById(R.id.button_see_java);
        button_see_testing = (Button)findViewById(R.id.button_see_testing);
        button_see_web = (Button)findViewById(R.id.button_see_web);
        button_see_big_data = (Button)findViewById(R.id.button_see_big_data);
        button_see_sap = (Button)findViewById(R.id.button_see_sap);
        button_see_microsoft = (Button)findViewById(R.id.button_see_microsoft);
        button_see_oracle = (Button)findViewById(R.id.button_see_oracle);
        button_see_data_warehouse = (Button)findViewById(R.id.button_see_data_warehouse);

        java_query = (Button)findViewById(R.id.java_query);
        testing_query = (Button)findViewById(R.id.testing_query);
        web_query = (Button)findViewById(R.id.web_query);
        big_query = (Button)findViewById(R.id.big_query);
        sap_query = (Button)findViewById(R.id.sap_query);
        microsoft_query = (Button)findViewById(R.id.microsoft_query);
        oracle_query = (Button)findViewById(R.id.oracle_query);
        data_query = (Button)findViewById(R.id.data_query);

        java_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Enquiry.class);
                startActivity(intent);
            }
        });

        testing_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Enquiry.class);
                startActivity(intent);
            }
        });

        web_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Enquiry.class);
                startActivity(intent);
            }
        });

        big_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Enquiry.class);
                startActivity(intent);
            }
        });

        sap_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Enquiry.class);
                startActivity(intent);
            }
        });

        microsoft_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Enquiry.class);
                startActivity(intent);
            }
        });

        oracle_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Enquiry.class);
                startActivity(intent);
            }
        });

        data_query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Enquiry.class);
                startActivity(intent);
            }
        });




        button_see_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Java_training.class);
                startActivity(intent);
            }
        });

        button_see_testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Testing_training.class);
                startActivity(intent);
            }
        });

        button_see_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Web_training.class);
                startActivity(intent);
            }
        });

        button_see_big_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Big_training.class);
                startActivity(intent);
            }
        });

        button_see_sap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Sap_training.class);

                startActivity(intent);
            }
        });

        button_see_microsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Microsoft_training.class);
                startActivity(intent);
            }
        });

        button_see_oracle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Oracle_training.class);
                startActivity(intent);
            }
        });


        button_see_data_warehouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Training.this, Data_warehouse_training.class);
                startActivity(intent);
            }
        });

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.swing_up_left);
        CardView anim= (CardView) findViewById(R.id.javaanim);
        CardView anim1= (CardView) findViewById(R.id.stesting);
        CardView anim2= (CardView) findViewById(R.id.webtech);
        CardView anim3= (CardView) findViewById(R.id.bigd);
        CardView anim4= (CardView) findViewById(R.id.sapp);
        CardView anim5= (CardView) findViewById(R.id.microsft);
        CardView anim6= (CardView) findViewById(R.id.ora);
        CardView anim7= (CardView) findViewById(R.id.dw);
        anim.startAnimation(animation);
        anim1.startAnimation(animation);
        anim2.startAnimation(animation);
        anim3.startAnimation(animation);
        anim4.startAnimation(animation);
        anim5.startAnimation(animation);
        anim6.startAnimation(animation);
        anim7.startAnimation(animation);

    }
}
