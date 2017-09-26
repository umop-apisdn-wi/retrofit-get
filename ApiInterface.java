package com.mapthread.mayo.rest;

/**
 * Created by cassada on 14/08/17.
 */


import com.mapthread.mayo.Model.PlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {


    @GET("rishabhrahul09/dd")
    Call<PlaceResponse> getdd();
}
/**
 @GET("/RetrofitExample/books.json")
 public void getBooks(Callback<List<Book>> response);
 }
 @GET("/api/unknown")
 Call<MultipleResource> doGetListResources();
 */