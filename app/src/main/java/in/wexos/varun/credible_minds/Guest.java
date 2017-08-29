package in.wexos.varun.credible_minds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import in.wexos.varun.credible_minds.model.Enqu;
import in.wexos.varun.credible_minds.model.Guestclass;

public class Guest extends AppCompatActivity {
    EditText num;
    Button guestlogin;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        num= (EditText) findViewById(R.id.et_num);
        guestlogin= (Button) findViewById(R.id.guest1);
        firebaseAuth = FirebaseAuth.getInstance();
        guestlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = num.getText().toString().trim();

                Guestclass guest=new Guestclass(phone);

                FirebaseUser guestuser = firebaseAuth.getCurrentUser();

                databaseReference.child(guestuser.getUid()).setValue(guest);

                Intent  intent=new Intent(Guest.this,Home.class);
                startActivity(intent);
            }
        });
        databaseReference = FirebaseDatabase.getInstance().getReference();
    }
}
