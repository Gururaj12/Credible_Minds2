package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import in.wexos.varun.credible_minds.R;

import in.wexos.varun.credible_minds.Study.Dot_net_study.Dot_net_tpoint;
import in.wexos.varun.credible_minds.Study.Dot_net_study.Dot_net_tutorials;
import in.wexos.varun.credible_minds.Study.Dot_net_study.Dot_net_tutorials_point;

public class Dot_net_Study extends AppCompatActivity {
    CardView
            cardview_net_tpoint,
            cardview_net_tutorials,
            cardview_net_tutorials_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot_net__study);

        cardview_net_tpoint = (CardView)findViewById(R.id.cardview_net_tpoint);
        cardview_net_tutorials = (CardView)findViewById(R.id.cardview_net_tutorials);
        cardview_net_tutorials_point = (CardView)findViewById(R.id.cardview_net_tutorials_point);

        cardview_net_tpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dot_net_Study.this, Dot_net_tpoint.class);
                startActivity(intent);
            }
        });

        cardview_net_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dot_net_Study.this, Dot_net_tutorials_point.class);
                startActivity(intent);
            }
        });

        cardview_net_tutorials_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dot_net_Study.this, Dot_net_tutorials.class);
                startActivity(intent);
            }
        });
    }
}

