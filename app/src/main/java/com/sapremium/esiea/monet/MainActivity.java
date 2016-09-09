package com.sapremium.esiea.monet;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements ConnexionFragment.OnFragmentInteractionListener,
        HomeFragment.OnFragmentInteractionListener
{


    private final HomeFragment fragHome = new HomeFragment();
    private final ConnexionFragment fragConnexion = new ConnexionFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---Fragments
        getFragmentManager().beginTransaction().replace(R.id.fragment_content, fragConnexion).commit();

    }

    @Override
    public void onFragmentInteraction(String str) {
        // Do different stuff
    }

    public void fragHome()
    {
        getFragmentManager().beginTransaction().replace(R.id.fragment_content, fragHome).commit();
    }
}
