package in.wexos.varun.credible_minds.Training_terms;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import in.wexos.varun.credible_minds.R;

public class Web_training extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_training);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.swing_up_left);
        CardView anim = (CardView) findViewById(R.id.web1);
        CardView anim1 = (CardView) findViewById(R.id.web2);
        anim.startAnimation(animation);
        anim1.startAnimation(animation);


        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" Web Development Training ");
        collapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.black));


    }


}



