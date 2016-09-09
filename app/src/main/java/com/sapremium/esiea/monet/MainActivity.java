package com.sapremium.esiea.monet;

import android.os.AsyncTask;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements ConnexionFragment.OnFragmentInteractionListener,
        HomeFragment.OnFragmentInteractionListener, SimuFragment.OnFragmentInteractionListener
{


    private final HomeFragment fragHome = new HomeFragment();
    private final ConnexionFragment fragConnexion = new ConnexionFragment();
    private final SimuFragment fragSimu = new SimuFragment();

    public final User[] users = new User[10];
    public final Corps[] corps = new Corps[50];


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncTask comDB = new ComDB(users, corps).execute();
        setupActionBar();

        //---Fragments
        getFragmentManager().beginTransaction().replace(R.id.fragment_content, fragConnexion).commit();

    }

    /** Return Button activity */
    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowCustomEnabled(true); // enable overriding the default toolbar layout
        }
    }

    // back -> Main Activity
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(String str) {
        // Do different stuff
    }

    public void fragHome()
    {

        getFragmentManager().beginTransaction().replace(R.id.fragment_content, fragHome).commit();
    }


    public void fragSimu()
    {
        getFragmentManager().beginTransaction().replace(R.id.fragment_content, fragSimu).commit();
    }
}
