package com.FourSqure.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class labeledLatLngs implements Serializable {

    @SerializedName("label")
    private String label;

    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double lng;




    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
