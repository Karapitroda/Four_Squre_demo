package com.FourSqure.model;

import com.google.gson.annotations.SerializedName;

public class NoticeList {

    @SerializedName("response")
    private Response noticeList;

    public Response getNoticeList() {
        return noticeList;
    }

    public void setNoticeList(Response noticeList) {
        this.noticeList = noticeList;
    }
}