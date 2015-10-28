package com.ezioshiki.customviewapp.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ezioshiki.customviewapp.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends BaseFragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,layout);
        return layout;
    }

    @OnClick(R.id.poor_clock_fragment_btn)
    void poorClock(){goTo(new PoorClockFragment());}

    @OnClick(R.id.nice_text_orientation_clock_fragment)
    void niceTextOrientation(){goTo(new NiceTextOrientationClockFragment());}

    private void goTo(@NonNull Fragment fragment){
        final String tag = fragment.getClass().getSimpleName();
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(tag)
                .replace(android.R.id.content,fragment,tag)
                .commit();
    }


}
