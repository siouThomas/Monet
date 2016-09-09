package com.sapremium.esiea.monet;

/**
 * Created by Antoine on 09/09/2016.
 */
public class Corps {
    public String corps;
    public String libCorps;
    public String cat;
    public String libCat;

    public Corps(String corps, String libCorps, String cat, String libCat) {
        this.corps = corps;
        this.libCorps = libCorps;
        this.cat = cat;
        this.libCat = libCat;
    }

    public String getCorps() {
        return corps;
    }

    public String getLibCorps() {
        return libCorps;
    }

    public String getCat() {
        return cat;
    }

    public String getLibCat() {
        return libCat;
    }
}
