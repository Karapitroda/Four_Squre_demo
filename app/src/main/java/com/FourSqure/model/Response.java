package com.FourSqure.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Response {
    @SerializedName("venues")
    private ArrayList<Venues> noticeList;

    public ArrayList<Venues> getNoticeArrayList() {
        return noticeList;
    }

    public void setNoticeArrayList(ArrayList<Venues> noticeArrayList) {
        this.noticeList = noticeArrayList;
    }


}
