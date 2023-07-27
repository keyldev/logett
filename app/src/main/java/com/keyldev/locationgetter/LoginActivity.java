package com.keyldev.locationgetter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        TextView createAccount = (TextView) findViewById(R.id.showRegistration);
        createAccount.setOnClickListener(l->{

            startActivity(new Intent(this, RegistrationActivity.class));
            finish();
        });
        Button signInButton = (Button) findViewById(R.id.logInButton);
        signInButton.setOnClickListener(l->{
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

    }
}