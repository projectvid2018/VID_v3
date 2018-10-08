package com.example.gmmha.vid_v3.vid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.gmmha.vid_v3.R;

public class PassportActivity extends AppCompatActivity {

    private Toolbar eToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passport);

        eToolbar = findViewById(R.id.eduPageToolbarId);
        setSupportActionBar(eToolbar);
        getSupportActionBar().setTitle("Passport");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
