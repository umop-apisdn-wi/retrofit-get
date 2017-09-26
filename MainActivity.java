package com.mapthread.mayo.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import com.mapthread.mayo.Adapter.PlaceAdapter;
import com.mapthread.mayo.Model.PlaceResponse;
import com.mapthread.mayo.Model.place;
import com.mapthread.mayo.R;
import com.mapthread.mayo.rest.ApiClient;
import com.mapthread.mayo.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private View Vm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.places_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<PlaceResponse> call = apiService.getdd();
        call.enqueue(new Callback<PlaceResponse>() {
            @Override
            public void onResponse(Call<PlaceResponse> call, Response<PlaceResponse> response) {
                int statusCode = response.code();
                List<place> places = response.body().getPlaces();
                recyclerView.setAdapter(new PlaceAdapter(places, R.layout.list_item, getApplicationContext()));


            }

            @Override
            public void onFailure(Call<PlaceResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });




    }

  }