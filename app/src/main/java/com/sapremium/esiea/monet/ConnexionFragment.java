package com.sapremium.esiea.monet;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Thomas on 09/09/2016.
 */
public class ConnexionFragment extends Fragment
{

        //private static final String test;

        private User[] user;
        private Corps[] corps;

        private OnFragmentInteractionListener mListener;


        public static ConnexionFragment newInstance() {
            ConnexionFragment fragment = new ConnexionFragment();

            return fragment;
        }

        public ConnexionFragment() {
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View view = inflater
                    .inflate(R.layout.connexion_fragment, container, false);

            Button button = (Button) view.findViewById(R.id.connection);
            button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    AsyncTask comDB = new ComDB(user, corps).execute();
                    ((MainActivity)getActivity()).fragHome();
                }
            });

            return view;
        }


        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            try {
                mListener = (OnFragmentInteractionListener) activity;
            } catch (ClassCastException e) {
                throw new ClassCastException(activity.toString()
                        + " must implement OnFragmentInteractionListener");
            }
        }

        @Override
        public void onDetach() {
            super.onDetach();
            mListener = null;
        }

        public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        }

}

