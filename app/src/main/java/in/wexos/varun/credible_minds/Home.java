package in.wexos.varun.credible_minds;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import in.wexos.varun.credible_minds.Interview_Questions.Main2Activity;
import in.wexos.varun.credible_minds.Quiz.Main2Activity_Quiz;
import in.wexos.varun.credible_minds.Study.MainActivity_Study;
import in.wexos.varun.credible_minds.Technical_Terms.MainActivity_Terms;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    CardView video_card, interview_card, quiz_card, technical_card, training_card, study_card,
            contact_card, service_card, about_card;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        video_card = (CardView)findViewById(R.id.video_card);
        interview_card = (CardView)findViewById(R.id.interview_card);
        quiz_card = (CardView)findViewById(R.id.quiz_card);
        technical_card = (CardView)findViewById(R.id.technical_card);
        training_card = (CardView)findViewById(R.id.training_card);
        study_card = (CardView)findViewById(R.id.study_card);
        contact_card = (CardView)findViewById(R.id.contact_card);
        service_card = (CardView)findViewById(R.id.service_card);
        about_card = (CardView)findViewById(R.id.about_card);

        video_card.startAnimation(animation);
        interview_card.startAnimation(animation);
        quiz_card.startAnimation(animation);
        technical_card.startAnimation(animation);
        training_card.startAnimation(animation);
        study_card.startAnimation(animation);
        contact_card.startAnimation(animation);
        service_card.startAnimation(animation);
        about_card.startAnimation(animation);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.mark)
                .setTitle("Credible Minds")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_login) {
            Intent intent=new Intent(Home.this,Login.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_register) {
            Intent intent=new Intent(Home.this,Register.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            // Handle the camera action
        } else if (id == R.id.video) {
            Intent intent=new Intent(Home.this,Videoplay.class);
            startActivity(intent);

        } else if (id == R.id.contact) {
            Intent intent=new Intent(Home.this,Contactus.class);
            startActivity(intent);

        } else if (id == R.id.quiz) {
            Intent intent=new Intent(Home.this,Main2Activity_Quiz.class);
            startActivity(intent);

        } else if (id == R.id.interview) {
            Intent intent=new Intent(Home.this,Main2Activity_Quiz.class);
            startActivity(intent);

        } else if (id == R.id.technical) {
            Intent intent = new Intent(Home.this, Main2Activity_Quiz.class);
            startActivity(intent);
        }else if(id == R.id.nav_share){
            Intent sharingIntent=new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBodyText="Check it out.your message goes hero";
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject/Title");
            sharingIntent.putExtra(Intent.EXTRA_TEXT,shareBodyText);
            startActivity(Intent.createChooser(sharingIntent,"Sharing Option"));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void video(View view){
        Intent intent=new Intent(Home.this,Videoplay.class);
        startActivity(intent);

    }
    public void interview(View view){
        Intent intent =new Intent(Home.this, Main2Activity.class);
        startActivity(intent);

    }

    public void quiz(View view){
        Intent intent=new Intent(Home.this, Main2Activity_Quiz.class);
        startActivity(intent);
    }

    public void technical(View view){
        Intent intent=new Intent(Home.this, MainActivity_Terms.class);
        startActivity(intent);
    }


    public void training(View view){
        Intent intent =new Intent(Home.this, Training.class);
        startActivity(intent);

    }

    public void study(View view){
        Intent intent=new Intent(Home.this, MainActivity_Study.class);
        startActivity(intent);
    }

    public void contact(View view){
        Intent intent=new Intent(Home.this,Contactus.class);
        startActivity(intent);
    }


    public void sevice(View view){
        Intent intent=new Intent(Home.this,Ourservices.class);
        startActivity(intent);


    }

    public void about_us(View view){
        Intent intent=new Intent(Home.this,About_Us.class);
        startActivity(intent);


    }


}
