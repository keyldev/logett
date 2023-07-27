package com.keyldev.locationgetter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.rtt.WifiRttManager;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }
        FrameLayout frame = (FrameLayout) findViewById(R.id.frame_layout);
        FloatingActionButton showMyLocation = (FloatingActionButton) findViewById(R.id.floatingButton);
        showMyLocation.setOnClickListener(l->{
            replaceFragment(new MyLocationFragment());
        });
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(l -> {
            switch (l.getItemId()) {
                case R.id.account: {
                    replaceFragment(new AccountFragment());
                    break;
                }
                case R.id.locations:{
                    replaceFragment(new LocationsFragment());
                    break;
                }
            }
            return true;
        });


    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

}