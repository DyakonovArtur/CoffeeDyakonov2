package com.example.coffeedyakonov;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

interface CoffeeAPI {
    @GET("/coffee/hot")
    Call<List<Coffee>> getData();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.sampleapis.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
