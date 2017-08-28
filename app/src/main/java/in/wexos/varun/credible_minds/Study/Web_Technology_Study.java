package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import in.wexos.varun.credible_minds.R;
import in.wexos.varun.credible_minds.Study.Web_technology_study.Web_tpoint;
import in.wexos.varun.credible_minds.Study.Web_technology_study.Web_tutorials_point;
import in.wexos.varun.credible_minds.Study.Web_technology_study.Web_w3school;

public class Web_Technology_Study extends AppCompatActivity {

    CardView
            cardview_web_tutorials,
            cardview_web_online_tutorials,
            cardview_web_tutorials_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web__technology__study);

        cardview_web_tutorials = (CardView)findViewById(R.id.cardview_web_tutorials);
        cardview_web_online_tutorials = (CardView)findViewById(R.id.cardview_web_online_tutorials);
        cardview_web_tutorials_point = (CardView)findViewById(R.id.cardview_web_tutorials_point);

        cardview_web_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Web_Technology_Study.this, Web_tpoint.class);
                startActivity(intent);
            }
        });

        cardview_web_online_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Web_Technology_Study.this, Web_tutorials_point.class);
                startActivity(intent);
            }
        });

        cardview_web_tutorials_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Web_Technology_Study.this, Web_w3school.class);
                startActivity(intent);
            }
        });
    }
}


