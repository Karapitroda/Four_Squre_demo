package com.FourSqure.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class venuePage implements Serializable {
    @SerializedName("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
