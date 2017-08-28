package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import in.wexos.varun.credible_minds.R;
import in.wexos.varun.credible_minds.Study.Big_data_study.Big_data_tutorials;
import in.wexos.varun.credible_minds.Study.Big_data_study.Big_tpoint;
import in.wexos.varun.credible_minds.Study.Big_data_study.Big_tutorials_point;

public class Big_Data_Study extends AppCompatActivity {


    CardView
            cardview_big_tpoint,
            cardview_big_tutorials_point,
            cardview_big_hadoop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big__data__study);

        cardview_big_tpoint = (CardView)findViewById(R.id.cardview_big_tpoint);
        cardview_big_tutorials_point = (CardView)findViewById(R.id.cardview_big_tutorials_point);
        cardview_big_hadoop = (CardView)findViewById(R.id.cardview_big_hadoop);

        cardview_big_tpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Big_Data_Study.this, Big_tpoint.class);
                startActivity(intent);
            }
        });

        cardview_big_tutorials_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Big_Data_Study.this, Big_tutorials_point.class);
                startActivity(intent);
            }
        });

        cardview_big_hadoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Big_Data_Study.this, Big_data_tutorials.class);
                startActivity(intent);
            }
        });
    }
}
