package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import in.wexos.varun.credible_minds.R;

import in.wexos.varun.credible_minds.Study.Java_script_study.JavaScript_tpoint;
import in.wexos.varun.credible_minds.Study.Java_script_study.JavaScript_w3school;
import in.wexos.varun.credible_minds.Study.Java_script_study.Java_script_tutorials_point;

public class Java_Script extends AppCompatActivity {

    CardView
            cardview_javascript_tutorials_point,
            cardview_javascript_tpoint,
            cardview_javascript_w3school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__script);

        cardview_javascript_tutorials_point = (CardView)findViewById(R.id.cardview_javascript_tutorials_point);
        cardview_javascript_tpoint = (CardView)findViewById(R.id.cardview_javascript_tpoint);
        cardview_javascript_w3school = (CardView)findViewById(R.id.cardview_javascript_w3school);

        cardview_javascript_tutorials_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java_Script.this, Java_script_tutorials_point.class);
                startActivity(intent);
            }
        });

        cardview_javascript_tpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java_Script.this, JavaScript_tpoint.class);
                startActivity(intent);
            }
        });

        cardview_javascript_w3school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java_Script.this, JavaScript_w3school.class);
                startActivity(intent);
            }
        });
    }
}
