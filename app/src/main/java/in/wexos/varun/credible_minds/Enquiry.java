package in.wexos.varun.credible_minds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import in.wexos.varun.credible_minds.model.Contact;
import in.wexos.varun.credible_minds.model.Enqu;

public class Enquiry extends AppCompatActivity {
    EditText name,email,phone,course,message;
    Button send;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enquiry);
        //jjjdjh
        name= (EditText) findViewById(R.id.name);
        email= (EditText) findViewById(R.id.email_id);
        phone= (EditText) findViewById(R.id.phone_number);
        course= (EditText) findViewById(R.id.course);
        message= (EditText) findViewById(R.id.message);
        send= (Button) findViewById(R.id.btnLinkToRegisterScreen);
        firebaseAuth = FirebaseAuth.getInstance();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nam = name.getText().toString().trim();
                String ema = email.getText().toString().trim();
                String phn = phone.getText().toString().trim();
                String cours = course.getText().toString().trim();
                String mesg = message.getText().toString().trim();

                //creating a userinformation object
                Enqu userInfo = new Enqu(nam, ema, phn, cours, mesg);

                //getting the current logged in user
                FirebaseUser users = firebaseAuth.getCurrentUser();


                databaseReference.child(users.getUid()).setValue(userInfo);

                //displaying a success toast
                Toast.makeText(getApplicationContext(),"Data Stored",Toast.LENGTH_LONG).show();


            }
        });
        databaseReference = FirebaseDatabase.getInstance().getReference();

    }}
