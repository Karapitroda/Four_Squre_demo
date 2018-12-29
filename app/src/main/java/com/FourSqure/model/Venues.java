package com.FourSqure.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Venues implements Serializable {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("referralId")
    private String referralId;
    @SerializedName("hasPerk")
    private boolean hasPerk;

    public Venues(String id, String name, String referralId, boolean hasPerk) {
        this.id = id;
        this.name = name;
        this.referralId = referralId;
        this.hasPerk = hasPerk;
    }



    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    public boolean isHasPerk() {
        return hasPerk;
    }

    public void setHasPerk(boolean hasPerk) {
        this.hasPerk = hasPerk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @SerializedName("categories")
    private ArrayList<Categories> categoriesList;

    @SerializedName("location")
    private Location locationObj;

    @SerializedName("venuePage")
    private venuePage venuePageObj;


    public ArrayList<Categories> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(ArrayList<Categories> categoriesList) {
        this.categoriesList = categoriesList;
    }

    public Location getLocationObj() {
        return locationObj;
    }

    public void setLocationObj(Location locationObj) {
        this.locationObj = locationObj;
    }

    public venuePage getVenuePageObj() {
        return venuePageObj;
    }

    public void setVenuePageObj(venuePage venuePageObj) {
        this.venuePageObj = venuePageObj;
    }
}
