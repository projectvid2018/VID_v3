package com.example.gmmha.vid_v3;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.gmmha.vid_v3.navigation_activity.AboutActivity;
import com.example.gmmha.vid_v3.navigation_activity.FileActivity;
import com.example.gmmha.vid_v3.navigation_activity.ProfileActivity;
import com.example.gmmha.vid_v3.vid.activity.EducationActivity;
import com.example.gmmha.vid_v3.vid.activity.InformationActivity;
import com.example.gmmha.vid_v3.vid.activity.NidActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    // DrawerLayout
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private NavigationView mNavigationView;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        mToolbar = findViewById(R.id.homePageToolbarId);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Home");

        //DrawerLayout
        mDrawerLayout = findViewById(R.id.drawerId);
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.nav_open,R.string.nav_close);
        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //NavigationView
        mNavigationView = findViewById(R.id.navigationId);
        mNavigationView.setNavigationItemSelectedListener(this);

    }


    //DrawerLayout clickable
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(mActionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //NavigationView clickable
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Intent intent;
        if(item.getItemId() == R.id.homeMenuId)
        {
            intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId() == R.id.profileMenuId)
        {
            intent = new Intent(this,ProfileActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId() == R.id.fileMenuId)
        {
            intent = new Intent(this,FileActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId() == R.id.aboutUsMenuId)
        {
            intent = new Intent(this,AboutActivity.class);
            startActivity(intent);
        }

        else if (item.getItemId() == R.id.shareMenuId)
        {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String sub = "VID";

            intent.putExtra(Intent.EXTRA_SUBJECT,sub);

            startActivity(Intent.createChooser(intent,"Share with"));
        }
        return false;
    }


    public void Nid(View view) {

        Intent intent ;
        intent = new Intent(this,NidActivity.class);
        startActivity(intent);
    }

    public void education(View view) {

        Intent intent ;
        intent = new Intent(this,EducationActivity.class);
        startActivity(intent);
    }

    public void Information(View view) {

        Intent intent ;
        intent = new Intent(this,InformationActivity.class);
        startActivity(intent);
    }
}
