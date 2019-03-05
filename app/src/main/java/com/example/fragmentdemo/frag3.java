package com.example.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class frag3 extends FragmentThatCanRespondToBack {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate( R.layout.frag3,container,false );
        return view;
    }

    @Override
    public boolean onBackPressed() {
        getFragmentManager().beginTransaction().replace(R.id.Fragment_container,new frag2()).commit();
        return true;
    }
}
