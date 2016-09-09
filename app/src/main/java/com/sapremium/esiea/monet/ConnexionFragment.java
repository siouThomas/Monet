package com.sapremium.esiea.monet;

import android.app.Activity;
import android.app.Fragment;
import android.os.AsyncTask;
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
            final Boolean isFinished = false;
            View view = inflater
                    .inflate(R.layout.connexion_fragment, container, false);

            Button button = (Button) view.findViewById(R.id.connection);
            button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    //AsyncTask comDB = new ComDB(((MainActivity)getActivity()).users, ((MainActivity)getActivity()).corps).execute();

                    /*try
                        {
                            Thread.sleep(1000);
                        }
                        catch (Exception e)
                        {

                        }*/

                    ((MainActivity) getActivity()).fragHome();
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

