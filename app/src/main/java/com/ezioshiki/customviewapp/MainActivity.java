package com.ezioshiki.customviewapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.ezioshiki.customviewapp.fragments.MainFragment;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .replace(android.R.id.content,new MainFragment(),this.toString())
                    .commit();
        }
    }
}
