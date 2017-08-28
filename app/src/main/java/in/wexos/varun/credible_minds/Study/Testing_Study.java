package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import in.wexos.varun.credible_minds.R;
import in.wexos.varun.credible_minds.Study.Testing_study.Testing_tutorials;
import in.wexos.varun.credible_minds.Study.Testing_study.Testing_tutorials_online;
import in.wexos.varun.credible_minds.Study.Testing_study.Testing_tutorials_point;

public class Testing_Study extends AppCompatActivity {

    CardView
            cardview_testing_tutorials,
            cardview_testing_online_tutorials,
            cardview_testing_tutorials_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing__study);

        cardview_testing_tutorials = (CardView)findViewById(R.id.cardview_testing_tutorials);
        cardview_testing_online_tutorials = (CardView)findViewById(R.id.cardview_testing_online_tutorials);
        cardview_testing_tutorials_point = (CardView)findViewById(R.id.cardview_testing_tutorials_point);

        cardview_testing_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Testing_Study.this, Testing_tutorials.class);
                startActivity(intent);
            }
        });

        cardview_testing_online_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Testing_Study.this, Testing_tutorials_online.class);
                startActivity(intent);
            }
        });

        cardview_testing_tutorials_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Testing_Study.this, Testing_tutorials_point.class);
                startActivity(intent);
            }
        });
    }
}


