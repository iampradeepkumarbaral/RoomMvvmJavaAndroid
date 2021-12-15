package com.pradeep.roomdatabaseretrofit.Network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {


    OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build();

    retrofit2.Retrofit retrofit=new retrofit2.Retrofit.Builder()
            .baseUrl(Url.URL_DATA)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    public Api api=retrofit.create(Api.class);
}
