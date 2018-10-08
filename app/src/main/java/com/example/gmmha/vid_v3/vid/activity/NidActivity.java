package com.example.gmmha.vid_v3.vid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.gmmha.vid_v3.R;

public class NidActivity extends AppCompatActivity {

    private Toolbar dToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nid);

        dToolbar = findViewById(R.id.drivePageToolbarId);
        setSupportActionBar(dToolbar);
        getSupportActionBar().setTitle("NID");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
