package com.sapremium.esiea.monet;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Thomas on 09/09/2016.
 */

public class HomeFragment extends Fragment
{

    //private static final String test;

    private OnFragmentInteractionListener mListener;


    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater
                .inflate(R.layout.home_fragment, container, false);

        //TODO VUE ACTION


        ((TextView) view.findViewById(R.id.prenomTxt)).setText(((MainActivity) getActivity()).users[0].getPrenom());
        ((TextView) view.findViewById(R.id.nomTxt)).setText(((MainActivity) getActivity()).users[0].getNom());
        ((TextView) view.findViewById(R.id.dtNaissTxt)).setText(((MainActivity) getActivity()).users[0].getDateNaissance());
        ((TextView) view.findViewById(R.id.lieuTxt)).setText(((MainActivity) getActivity()).users[0].getLieuNaissance());


        return view;
    }

    public void onButtonPressed(String uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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
        public void onFragmentInteraction(String str);
    }

}


