package com.keyldev.locationgetter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        setContentView(R.layout.activity_registration);
        TextView showLogin = (TextView) findViewById(R.id.showLogin);
        showLogin.setOnClickListener(l->{
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
    }
}