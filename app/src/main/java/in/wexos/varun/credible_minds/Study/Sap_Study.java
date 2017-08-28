package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import in.wexos.varun.credible_minds.R;

import in.wexos.varun.credible_minds.Study.Sap_study.Sap_tutorials;
import in.wexos.varun.credible_minds.Study.Sap_study.Sap_tutorials_online;
import in.wexos.varun.credible_minds.Study.Sap_study.Sap_tutorials_point;

public class Sap_Study extends AppCompatActivity {

    CardView
            cardview_sap_tutorials,
            cardview_sap_online_tutorials,
            cardview_sap_tutorials_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sap__study);

        cardview_sap_tutorials = (CardView)findViewById(R.id.cardview_sap_tutorials);
        cardview_sap_online_tutorials = (CardView)findViewById(R.id.cardview_sap_online_tutorials);
        cardview_sap_tutorials_point = (CardView)findViewById(R.id.cardview_sap_tutorials_point);

        cardview_sap_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sap_Study.this, Sap_tutorials.class);
                startActivity(intent);
            }
        });

        cardview_sap_online_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sap_Study.this, Sap_tutorials_online.class);
                startActivity(intent);
            }
        });

        cardview_sap_tutorials_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sap_Study.this, Sap_tutorials_point.class);
                startActivity(intent);
            }
        });
    }
}

