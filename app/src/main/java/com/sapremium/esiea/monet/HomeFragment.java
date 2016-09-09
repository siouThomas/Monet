package com.sapremium.esiea.monet;

import android.app.Activity;
import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Thomas on 09/09/2016.
 */

public class HomeFragment extends Fragment
{

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
        ((TextView) view.findViewById(R.id.emailTxt)).setText(((MainActivity) getActivity()).users[0].getAdresse());
        ((TextView) view.findViewById(R.id.statutTxt)).setText(((MainActivity) getActivity()).users[0].getStatut());
        ((TextView) view.findViewById(R.id.permisTxt)).setText(((MainActivity) getActivity()).users[0].getPermis());
        ((TextView) view.findViewById(R.id.niveauTxt)).setText(((MainActivity) getActivity()).users[0].getNiveauEtudes());
        ((TextView) view.findViewById(R.id.corpsTxt)).setText(((MainActivity) getActivity()).users[0].getCorps());
        ((TextView) view.findViewById(R.id.gradeTxt)).setText(((MainActivity) getActivity()).users[0].getGrade());
        ((TextView) view.findViewById(R.id.echelonTxt)).setText(((MainActivity) getActivity()).users[0].getEchelon());

        /*Button button = (Button) view.findViewById(R.id.bSimulation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((MainActivity) getActivity()).fragSimu();
            }
        });*/


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


