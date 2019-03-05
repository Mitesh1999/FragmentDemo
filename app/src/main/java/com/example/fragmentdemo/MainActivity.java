package com.example.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add( R.id.Fragment_container,new frag1() );
        fragmentTransaction.commit();
    }


    @Override
    public void onBackPressed() {

        List fragmentList = getSupportFragmentManager().getFragments();
        boolean handle = false;

        for(Object f : fragmentList)
        {
            if(f instanceof FragmentThatCanRespondToBack){
                handle = ((FragmentThatCanRespondToBack)f).onBackPressed();

                if(handle)
                    break;
            }
        }

        if(!handle)
            super.onBackPressed();
    }

}

