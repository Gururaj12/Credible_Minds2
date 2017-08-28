package in.wexos.varun.credible_minds.Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import in.wexos.varun.credible_minds.R;
import in.wexos.varun.credible_minds.Study.Data_warehouse_study.Data_warehouse_tutorials;
import in.wexos.varun.credible_minds.Study.Data_warehouse_study.Data_warehouse_tutorials_point;

public class Data_warehouse_Study extends AppCompatActivity {
    CardView
            cardview_data_tutorials,
            cardview_data_tutorials_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_warehouse__study);

        cardview_data_tutorials = (CardView)findViewById(R.id.cardview_data_tutorials);
        cardview_data_tutorials_point = (CardView)findViewById(R.id.cardview_data_tutorials_point);


        cardview_data_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Data_warehouse_Study.this, Data_warehouse_tutorials.class);
                startActivity(intent);
            }
        });

        cardview_data_tutorials_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Data_warehouse_Study.this, Data_warehouse_tutorials_point.class);
                startActivity(intent);
            }
        });


    }
}


