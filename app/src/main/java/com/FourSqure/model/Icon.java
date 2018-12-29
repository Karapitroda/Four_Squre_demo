package com.FourSqure.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Icon implements Serializable {

    @SerializedName("prefix")
    private String prefix;

    @SerializedName("suffix")
    private String suffix;


    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
