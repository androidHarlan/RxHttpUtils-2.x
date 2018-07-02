package com.allen.rxhttputils.api;


import com.allen.library.bean.BaseData;
import com.allen.rxhttputils.bean.BookBean;
import com.allen.rxhttputils.bean.LoginBean;
import com.allen.rxhttputils.bean.Top250Bean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by allen on 2016/12/26.
 */

public interface ApiService {

    @GET("v2/book/1220562")
    Observable<BookBean> getBook();

    @GET("v2/movie/top250")
    Observable<Top250Bean> getTop250(@Query("count") int count);

    @GET("v2/book/1220562")
    Observable<String> getBookString();
    @POST("login")
    Observable<BaseData<LoginBean>> get(@QueryMap Map<String,String> map);
}
