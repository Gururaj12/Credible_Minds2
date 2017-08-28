package in.wexos.varun.credible_minds;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bumptech.glide.util.Util;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Register extends AppCompatActivity {
    Button register, button2;
    EditText name,email,passwword;
    private FirebaseAuth auth;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        auth = FirebaseAuth.getInstance();

        button2 = (Button)findViewById(R.id.btnLinkToLoginScreen);
        name= (EditText) findViewById(R.id.et_name);
        email= (EditText) findViewById(R.id.et_email);
        passwword= (EditText) findViewById(R.id.et_paswword);
        register = (Button)findViewById(R.id.button_register);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                            String emails = email.getText().toString().trim();
                String password  = passwword.getText().toString().trim();
                if(TextUtils.isEmpty(emails)){
                    Toast.makeText(Register.this,"Please enter email",Toast.LENGTH_LONG).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(Register.this,"Please enter password",Toast.LENGTH_LONG).show();
                    return;
                }

                //progressDialog.setMessage("Registering Please Wait...");
              //  progressDialog.show();
                //creating a new user
                auth.createUserWithEmailAndPassword(emails, password)
                        .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete( Task<AuthResult> task) {
                                //checking if success
                                if(task.isSuccessful()){
                                    //display some message here
                                    Toast.makeText(Register.this,"Successfully registered",Toast.LENGTH_LONG).show();
                                }else{
                                    //display some message here
                                    Toast.makeText(Register.this,"Registration Error",Toast.LENGTH_LONG).show();
                                }
                               // progressDialog.dismiss();
                            }
                        });

            }
        });
    }
}
