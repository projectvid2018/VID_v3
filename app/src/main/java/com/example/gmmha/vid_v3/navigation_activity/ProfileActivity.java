package com.example.gmmha.vid_v3.navigation_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.gmmha.vid_v3.R;

public class ProfileActivity extends AppCompatActivity {

    private Toolbar pToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        pToolbar = findViewById(R.id.proPageToolbarId);
        setSupportActionBar(pToolbar);
        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
