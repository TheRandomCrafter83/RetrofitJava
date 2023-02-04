package com.coderz.f1.retrofitjava;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApi {
    @GET("/s/sh0s8iddz56ipcs/link.json?dl=0")
    Call<Link> getResult();
}
