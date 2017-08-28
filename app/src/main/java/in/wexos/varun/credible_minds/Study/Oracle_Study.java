package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import in.wexos.varun.credible_minds.R;
import in.wexos.varun.credible_minds.Study.Oracle_study.Oracle_tpoint;
import in.wexos.varun.credible_minds.Study.Oracle_study.Oracle_tutorials;
import in.wexos.varun.credible_minds.Study.Oracle_study.Oracle_tutorials_point;

public class Oracle_Study extends AppCompatActivity {

    CardView
            cardview_oracle_tpoint,
            cardview_oracle_tutorials,
            cardview_oracle_tutorials_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oracle__study);

        cardview_oracle_tpoint = (CardView)findViewById(R.id.cardview_oracle_tpoint);
        cardview_oracle_tutorials = (CardView)findViewById(R.id.cardview_oracle_tutorials);
        cardview_oracle_tutorials_point = (CardView)findViewById(R.id.cardview_oracle_tutorials_point);

        cardview_oracle_tpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oracle_Study.this, Oracle_tpoint.class);
                startActivity(intent);
            }
        });

        cardview_oracle_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oracle_Study.this, Oracle_tutorials.class);
                startActivity(intent);
            }
        });

        cardview_oracle_tutorials_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oracle_Study.this, Oracle_tutorials_point.class);
                startActivity(intent);
            }
        });
    }
}
