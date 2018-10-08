package com.example.gmmha.vid_v3.vid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.gmmha.vid_v3.R;

public class InformationActivity extends AppCompatActivity {

    private Toolbar iToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        iToolbar = findViewById(R.id.eduPageToolbarId);
        setSupportActionBar(iToolbar);
        getSupportActionBar().setTitle("Information");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
