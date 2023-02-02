package com.coderz.f1.retrofitjava;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApi {
    @GET("/test.json")
    Call<Link> getResult();
}
