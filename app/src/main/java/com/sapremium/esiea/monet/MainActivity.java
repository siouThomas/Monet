package com.sapremium.esiea.monet;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private final ConnexionFragment fragConnexion = new ConnexionFragment();
    private final HomeFragment fragHome = new HomeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---Fragments
        getFragmentManager().beginTransaction().replace(R.id.fragment_content, fragConnexion).commit();

    }
}
