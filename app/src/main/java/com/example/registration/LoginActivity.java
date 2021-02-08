package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText name = findViewById(R.id.editTextTextPersonName);
        EditText password = findViewById(R.id.editTextTextPassword2);
        Button submit = findViewById(R.id.buttonLogin);
        TextView login = findViewById(R.id.registerView);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //everything checked we open new activity
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
                //we close this activity
                finish();
            }
        });
    }
}