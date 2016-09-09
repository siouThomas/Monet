package com.sapremium.esiea.monet;

/**
 * Created by Antoine on 09/09/2016.
 */
public class User {
    public String matricule;
    public String prenom;
    public String nom;
    public String dateNaissance;
    public String lieuNaissance;
    public String adresse;
    public String statut;
    public String permis;
    public String niveauEtudes;
    public String corps;
    public String grade;
    public String echelon;
    public String mdp;

    public User(String matricule, String prenom, String nom, String dateNaissance, String lieuNaissance, String adresse,
                String statut, String permis, String niveauEtudes, String corps, String grade, String echelon, String mdp) {
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.statut = statut;
        this.permis = permis;
        this.niveauEtudes = niveauEtudes;
        this.corps = corps;
        this.grade = grade;
        this.echelon = echelon;
        this.mdp = mdp;
    }

    public String getMdp() {
        return mdp;
    }

    public String getNom() {
        return nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getStatut() {
        return statut;
    }

    public String getPermis() {
        return permis;
    }

    public String getNiveauEtudes() {
        return niveauEtudes;
    }

    public String getCorps() {
        return corps;
    }

    public String getGrade() {
        return grade;
    }

    public String getEchelon() {
        return echelon;
    }
}
