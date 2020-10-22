package com.example.restapidemo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DateService {
    @GET("api/json/est/now")
    Call<DateResponse> estTime();
}
