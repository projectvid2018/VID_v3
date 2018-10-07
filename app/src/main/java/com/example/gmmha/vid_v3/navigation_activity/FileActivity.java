package com.example.gmmha.vid_v3.navigation_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.gmmha.vid_v3.R;

public class FileActivity extends AppCompatActivity {

    private Toolbar fToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);

        fToolbar = findViewById(R.id.filePageToolbarId);
        setSupportActionBar(fToolbar);
        getSupportActionBar().setTitle("File");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
