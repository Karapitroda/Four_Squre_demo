package com.FourSqure.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Location implements Serializable {
    @SerializedName("address")
    private String address;

    @SerializedName("crossStreet")
    private String crossStreet;
    @SerializedName("postalCode")
    private String postalCode;
    @SerializedName("cc")
    private String cc;
    @SerializedName("city")
    private String city;
    @SerializedName("state")
    private String state;
    @SerializedName("country")
    private String country;

    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double lng;


    @SerializedName("distance")
    private int distance;





    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCrossStreet() {
        return crossStreet;
    }

    public void setCrossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
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
    @SerializedName("formattedAddress")
    private ArrayList<String> formattedAddArray;

    @SerializedName("labeledLatLngs")
    private ArrayList<labeledLatLngs> labeledLatLngsList;


    public ArrayList<String> getFormattedAddArray() {
        return formattedAddArray;
    }

    public void setFormattedAddArray(ArrayList<String> formattedAddArray) {
        this.formattedAddArray = formattedAddArray;
    }

    public ArrayList<labeledLatLngs> getLabeledLatLngsList() {
        return labeledLatLngsList;
    }

    public void setLabeledLatLngsList(ArrayList<labeledLatLngs> labeledLatLngsList) {
        this.labeledLatLngsList = labeledLatLngsList;
    }
}
