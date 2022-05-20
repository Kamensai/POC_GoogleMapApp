package com.khamvongsa.victor.poc_googlemapapp.utils;

import com.google.android.gms.maps.model.LatLng;
import com.khamvongsa.victor.poc_googlemapapp.model.NearbyRestaurant;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by <Victor Khamvongsa> on <11/05/2022>
 */
public interface MapAPIService {
    @GET("place/nearbysearch/json?")
    Call<NearbyRestaurant> getNearby(@Query("location") String location,
                                     @Query("type") String type,
                                     @Query("radius") int radius,
                                     @Query("key") String key);


     public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://maps.googleapis.com/maps/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
/*
    @Query("location") String location,
    @Query("type") String type,
    @Query("radius") int radius,
    @Query("key") String key

 */
}
