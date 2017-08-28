package in.wexos.varun.credible_minds;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;





public class Login extends AppCompatActivity {
    Button login, button1;
    EditText name,emai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name= (EditText) findViewById(R.id.et_name);
        emai= (EditText) findViewById(R.id.et_email);
        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Home.class);
                startActivity(intent);
            }
        });

        button1 = (Button)findViewById(R.id.btnLinkToRegisterScreen);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bgfhbgdfhj
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });
    }


}