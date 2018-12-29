package com.FourSqure.main_activity;

import com.FourSqure.model.NoticeList;
import com.FourSqure.model.Response;
import com.FourSqure.model.Venues;

/**
 * Created by Karan Pitroda on 29/12/2018.
 */

public interface MainContract {

    /**
     * Call when user interact with the view and other when view OnDestroy()
     */
    interface presenter {

        void onDestroy();

        void onRefreshButtonClick();

        void requestDataFromServer(String date,String ll);

    }

    /**
     * showProgress() and hideProgress() would be used for displaying and hiding the progressBar
     * while the setDataToRecyclerView and onResponseFailure is fetched from the GetNoticeInteractorImpl class
     **/
    interface MainView {

        void showProgress();

        void hideProgress();

        void setDataToRecyclerView(Response noticeArrayList);

        void onResponseFailure(Throwable throwable);

    }

    /**
     * Intractors are classes built for fetching data from your database, web services, or any other data source.
     **/
    interface GetNoticeIntractor {

        interface OnFinishedListener {
            void onFinished(Response noticeArrayList);

            void onFailure(Throwable t);
        }

        void getNoticeArrayList(OnFinishedListener onFinishedListener,String date,String ll);
    }
}
