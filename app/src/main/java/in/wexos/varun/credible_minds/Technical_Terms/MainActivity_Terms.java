package in.wexos.varun.credible_minds.Technical_Terms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import in.wexos.varun.credible_minds.R;

public class MainActivity_Terms extends AppCompatActivity {

    CardView
            cardview_java_material,
            cardview_testing_material,
            cardview_web_technology_material,
            cardview_big_data_material,
            cardview_sap_material,
            cardview_dot_net_material,
            cardview_oracle_material,
            cardview_data_warehouse_material,
            cardview_java_script_material;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__terms);

        cardview_java_material = (CardView)findViewById(R.id.cardview_java_terms);
        cardview_testing_material = (CardView)findViewById(R.id.cardview_testing_terms);
        cardview_web_technology_material = (CardView)findViewById(R.id.cardview_web_technology_terms);
        cardview_big_data_material = (CardView)findViewById(R.id.cardview_big_data_terms);
        cardview_sap_material = (CardView)findViewById(R.id.cardview_sap_terms);
        cardview_dot_net_material = (CardView)findViewById(R.id.cardview_dot_net_terms);
        cardview_oracle_material = (CardView)findViewById(R.id.cardview_oracle_terms);
        cardview_data_warehouse_material = (CardView)findViewById(R.id.cardview_data_warehouse_terms);
        cardview_java_script_material = (CardView)findViewById(R.id.cardview_java_script_terms);


        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);

        cardview_java_material.startAnimation(animation);
        cardview_testing_material.startAnimation(animation);
        cardview_web_technology_material.startAnimation(animation);
        cardview_big_data_material.startAnimation(animation);
        cardview_sap_material.startAnimation(animation);
        cardview_dot_net_material.startAnimation(animation);
        cardview_oracle_material.startAnimation(animation);
        cardview_data_warehouse_material.startAnimation(animation);
        cardview_java_script_material.startAnimation(animation);

        cardview_java_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Terms.this, Java_terms.class);
                startActivity(intent);
            }
        });

        cardview_testing_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Terms.this, Software_terms.class);
                startActivity(intent);
            }
        });


        cardview_web_technology_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Terms.this, web_terms.class);
                startActivity(intent);
            }
        });

        cardview_big_data_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Terms.this, Big_terms.class);
                startActivity(intent);
            }
        });

        cardview_sap_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Terms.this, sap_terms.class);
                startActivity(intent);
            }
        });

        cardview_dot_net_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Terms.this, asp_net_terms.class);
                startActivity(intent);
            }
        });

        cardview_oracle_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Terms.this, oracle_terms.class);
                startActivity(intent);
            }
        });

        cardview_data_warehouse_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Terms.this, data_warehouse_terms.class);
                startActivity(intent);
            }
        });

        cardview_java_script_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Terms.this, java_script_terms.class);
                startActivity(intent);
            }
        });



    }
}
