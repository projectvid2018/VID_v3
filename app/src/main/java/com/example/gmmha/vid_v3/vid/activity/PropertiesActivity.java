package com.example.gmmha.vid_v3.vid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.gmmha.vid_v3.R;

public class PropertiesActivity extends AppCompatActivity {

    private Toolbar lToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_properties);

        lToolbar = findViewById(R.id.eduPageToolbarId);
        setSupportActionBar(lToolbar);
        getSupportActionBar().setTitle("Passport");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
