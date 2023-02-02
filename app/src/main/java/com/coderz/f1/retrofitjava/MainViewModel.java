package com.coderz.f1.retrofitjava;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel  extends ViewModel {
    MyApi api;

    public MutableLiveData<Link> myLink = new MutableLiveData<>();

    public MainViewModel(){
        api = ApiClient.getClient().create(MyApi.class);
    }

    public void getLink(){
        Call<Link> call = api.getResult();
        call.enqueue(new Callback<Link>() {
            @Override
            public void onResponse(@NonNull Call<Link> call, @NonNull Response<Link> response) {
                myLink.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<Link> call, @NonNull Throwable t) {

            }
        });
    }
}
