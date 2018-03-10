package com.example.android.worker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    String email = "admin",pass="12345";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       //email edit text
        final EditText emailtext = (EditText)findViewById(R.id.Email);
        // password edit text
      final   EditText passtext = (EditText)findViewById(R.id.password);
        //login button
        Button login = (Button)findViewById(R.id.submit);
    // login button click event
        login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // check if any of user or password is empty
            if (TextUtils.isEmpty(emailtext.getText().toString())) {
                emailtext.setError("Your message");
            } else {
                if (TextUtils.isEmpty(passtext.getText().toString())) {
                    passtext.setError("Your message");
                } else {
                    // validate email && password
                    if (emailtext.getText().toString().equals(email) && passtext.getText().toString().equals(pass)) {
                        Toast.makeText(Login.this, "welcome", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Login.this,category.class);
                        startActivity(i);
                    }else{Toast.makeText(Login.this, "wrong email or pass", Toast.LENGTH_SHORT).show();}
                }
            }
        }
    });

    }


}
