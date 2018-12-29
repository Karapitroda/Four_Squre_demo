package com.FourSqure.main_activity;

import android.util.Log;

import com.FourSqure.model.NoticeList;
import com.FourSqure.my_interface.GetVanueDataService;
import com.FourSqure.network.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Karan Pitroda on 29/12/2018.
 */

public class GetVanueIntractorImpl implements MainContract.GetNoticeIntractor {

    @Override
    public void getNoticeArrayList(final OnFinishedListener onFinishedListener,String date,String ll) {


        /** Create handle for the RetrofitInstance interface*/
        GetVanueDataService service = RetrofitInstance.getRetrofitInstance().create(GetVanueDataService.class);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<NoticeList> call = service.getNoticeData(date, "UZZNQVEJHZOE10YAS2Q4ZJ3MU4P3C0TDIDZTSQ1JYKQFMOQT", "SGMPQPGJPO5KSPHQWUPOF2LHOUJDBMVLND0E4HP53O34UNPW",ll);

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<NoticeList>() {
            @Override
            public void onResponse(Call<NoticeList> call, Response<NoticeList> response) {
                onFinishedListener.onFinished(response.body().getNoticeList());

            }

            @Override
            public void onFailure(Call<NoticeList> call, Throwable t) {
                onFinishedListener.onFailure(t);
            }
        });

    }


}
