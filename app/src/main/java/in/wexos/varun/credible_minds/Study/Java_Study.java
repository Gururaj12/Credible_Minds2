package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import in.wexos.varun.credible_minds.R;

import in.wexos.varun.credible_minds.Study.Java_study.Java_tpoint;
import in.wexos.varun.credible_minds.Study.Java_study.Java_tutorials_point;
import in.wexos.varun.credible_minds.Study.Java_study.Java_w3schools;

public class Java_Study extends AppCompatActivity {

    CardView
            cardview_java_tpoint,
            cardview_java_tutorials_point,
            cardview_java_w3school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__study);

        cardview_java_tpoint = (CardView)findViewById(R.id.cardview_java_tpoint);
        cardview_java_tutorials_point = (CardView)findViewById(R.id.cardview_java_tutorials_point);
        cardview_java_w3school = (CardView)findViewById(R.id.cardview_java_w3school);

        cardview_java_tpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java_Study.this, Java_tpoint.class);
                startActivity(intent);
            }
        });

        cardview_java_tutorials_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java_Study.this, Java_tutorials_point.class);
                startActivity(intent);
            }
        });

        cardview_java_w3school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java_Study.this, Java_w3schools.class);
                startActivity(intent);
            }
        });
    }
}
