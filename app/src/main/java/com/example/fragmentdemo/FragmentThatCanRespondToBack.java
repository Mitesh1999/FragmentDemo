package com.example.fragmentdemo;

import android.support.v4.app.Fragment;

public class FragmentThatCanRespondToBack extends Fragment {
    public boolean onBackPressed(){
        return false;
    }
}
