package com.example.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class frag2 extends FragmentThatCanRespondToBack{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate( R.layout.frag2,container,false );
        Button button=view.findViewById( R.id.Frag2);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace( R.id.Fragment_container,new frag3() );
                fragmentTransaction.commit();

            }
        } );
        return view;
    }

    @Override
    public boolean onBackPressed() {
        getFragmentManager().beginTransaction().replace(R.id.Fragment_container,new frag1()).commit();
        return true;
    }
}