package com.example.gmmha.vid_v3.navigation_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.gmmha.vid_v3.R;

public class AboutActivity extends AppCompatActivity {

    private Toolbar aToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
/*
        aToolbar = findViewById(R.id.aboutToolbarId);
        setSupportActionBar(aToolbar);
        getSupportActionBar().setTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       */
    }
}
