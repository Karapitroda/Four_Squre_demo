package com.FourSqure.my_interface;

import com.FourSqure.model.NoticeList;
import com.FourSqure.model.Venues;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetVanueDataService {

    @GET("v2/venues/search?")
    Call<NoticeList> getNoticeData(@Query("v") String v, @Query("client_secret") String client_secret, @Query("client_id") String client_id, @Query("ll") String ll);

}