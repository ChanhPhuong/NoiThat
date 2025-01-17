package com.example.noithat.data.remote;

import com.example.noithat.utils.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitContrller {
    private static Retrofit retrofit;

    public static WebService service(){
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(WebService.class);
    }
}
