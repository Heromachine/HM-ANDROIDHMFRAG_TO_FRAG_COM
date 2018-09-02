package com.example.jessi.android_hm_frag_to_frag_com;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.text.Layout;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Interface_MainActivity
{
     private static final String TAG = "MainActivity";
     private TextView txtvToolbar;

     private Button btnFragSingUp;
     private Button btnLogIn;

    private void doFragmentTransaction
        (
            Fragment frag,
            boolean addToBackStack,
            String tag,
            String msg
        )
    {
        //Create the Fragment tool needed to make changes to the Fragments in the stack
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        //Replaces the main acitvity fragment with selected frag as starter
        transaction.replace(R.id.main_container, frag, tag);

        //Puts the Fragment in the back of the stack once its not being used
        if(addToBackStack)
        {
            transaction.addToBackStack(tag);
        }

        //Commit the changes of Fragements
        transaction.commit();
    }
    private void init()
    {
        Frag_LogIn fragment = new Frag_LogIn();

        doFragmentTransaction
            (
                fragment,
                false,
                getString(R.string.frag_login_screen_vert),
                ""
            );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvToolbar = findViewById(R.id.toolbar_title);

        init();
    }

    @Override
    public void setToolbarTitle(String fragTitle) {
       txtvToolbar.setText(fragTitle);
    }
}
