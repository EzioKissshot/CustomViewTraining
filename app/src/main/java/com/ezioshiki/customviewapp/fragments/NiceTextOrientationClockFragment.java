package com.ezioshiki.customviewapp.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ezioshiki.customviewapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NiceTextOrientationClockFragment extends BaseFragment {


    public NiceTextOrientationClockFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nice_text_orientation_clock, container, false);
    }


}
