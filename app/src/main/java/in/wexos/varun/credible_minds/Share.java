package in.wexos.varun.credible_minds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Share extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }
    public void shareText(View view){
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareBodyText="your shareing message goes hero";
        intent.putExtra(Intent.EXTRA_SUBJECT,"Subject/Title");
        intent.putExtra(Intent.EXTRA_TEXT,shareBodyText);
        startActivity(Intent.createChooser(intent,"Choose sharing methed"));
    }
}
