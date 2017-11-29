package com.example.sasmob.fragmentsapp;


import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.sasmob.fragmentsapp.hct_studentmodule.HctStudents;
import com.example.sasmob.fragmentsapp.home.HCTHomeFragment;

public class Hct_home extends AppCompatActivity implements
        HCTHomeFragment.OnFragmentInteractionListener,
        HctStudents.OnFragmentInteractionListener{
    FrameLayout frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hcthome);
        HCTHomeFragment homeFragment= new HCTHomeFragment();
        frame = (FrameLayout) findViewById(R.id.main_container);
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        HCTHomeFragment fragment=new HCTHomeFragment();
        transaction.replace(R.id.main_container,fragment);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
