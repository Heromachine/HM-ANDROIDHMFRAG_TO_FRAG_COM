package com.example.jessi.android_hm_frag_to_frag_com;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.sql.SQLOutput;

public class Frag_LogIn extends Fragment {

    private Interface_MainActivity interface_mainActivity;



    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        interface_mainActivity = (Interface_MainActivity) getActivity();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        interface_mainActivity.setToolbarTitle(getTag());
    }

    @Nullable
    @Override
    public View onCreateView
        (
            @NonNull  LayoutInflater inflater,
            @Nullable ViewGroup      container,
            @Nullable Bundle         savedInstanceState
        )
    {//Create the View And choose first frag view as login fragment
        View view = inflater.inflate
                (
                    R.layout.frag_login_screen_vert,
                    container,
                    false
                );

        return view;
    }

}
