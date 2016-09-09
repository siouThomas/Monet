package com.sapremium.esiea.monet;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Struct;
import java.util.List;

/**
 * Created by Antoine on 08/09/2016.
 */

public class ComDB extends AsyncTask<Void, Void, String> {
    private User[] user;
    private Corps[] corps;

    public ComDB( User[] user, Corps[] corps){
        this.user = user;
        this.corps = corps;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... arg0) {

        URL url;
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        String line;

        try {

            url = new URL("http://kebabvisor.esy.es/importer_sap.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(15000);
            conn.connect();

            InputStream input = new BufferedInputStream(conn.getInputStream());
            br = new BufferedReader(new InputStreamReader(input));

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String strJson2 = sb.toString();
        return strJson2;



    }

    //@Override
    protected void onPostExecute(String result) {

        try {
            JSONObject jsonRootObject = new JSONObject(result);

            JSONArray jsonArray = jsonRootObject.optJSONArray("result");
            JSONArray jsonArray2 = jsonRootObject.optJSONArray("result2");

            for (int i = 0; i < jsonArray2.length(); i++) {
                JSONObject jsonObject2 = jsonArray2.getJSONObject(i);

                corps[i] = new Corps(jsonObject2.optString("code_corps"), jsonObject2.optString("libelle_du_corps"),
                        jsonObject2.optString("code_de_categorie").toString(), jsonObject2.optString("libelle_categorie").toString());

            }


            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                user[i] = new User(jsonObject.optString("matricule").toString(), jsonObject.optString("prenom").toString(), jsonObject.optString("nom").toString(),
                        jsonObject.optString("date_de_naissance").toString(),jsonObject.optString("lieu_de_naissance").toString(),jsonObject.optString("adresse").toString(),
                        jsonObject.optString("statut_marital").toString(),jsonObject.optString("permis").toString(),jsonObject.optString("niveau_etude").toString(),
                        jsonObject.optString("code_corps").toString(),jsonObject.optString("code_grades").toString(),jsonObject.optString("code_echelons").toString(),
                        jsonObject.optString("mot_de_passe").toString());

            }



        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}
