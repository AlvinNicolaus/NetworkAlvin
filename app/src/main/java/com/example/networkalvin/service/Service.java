package com.example.networkalvin.service;

import com.example.networkalvin.model.UserResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("/users")
    Call<List<UserResponseItem>> getDataUser();

}