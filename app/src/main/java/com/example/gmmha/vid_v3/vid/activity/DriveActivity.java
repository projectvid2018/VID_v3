package com.example.gmmha.vid_v3.vid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.gmmha.vid_v3.R;

public class DriveActivity extends AppCompatActivity {

    private Toolbar dToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);

        dToolbar = findViewById(R.id.drivePageToolbarId);
        setSupportActionBar(dToolbar);
        getSupportActionBar().setTitle("Drive");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
