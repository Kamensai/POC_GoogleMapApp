package com.khamvongsa.victor.poc_googlemapapp.utils;

import com.google.android.gms.maps.model.LatLng;
import com.khamvongsa.victor.poc_googlemapapp.BuildConfig;
import com.khamvongsa.victor.poc_googlemapapp.model.NearbyRestaurant;

import org.jetbrains.annotations.NotNull;

import java.lang.ref.WeakReference;

import androidx.annotation.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by <Victor Khamvongsa> on <17/05/2022>
 */
public class MapAPICalls {

    // 1 - Creating a callback
    public interface Callbacks {
        void onResponse(@Nullable NearbyRestaurant nearbyRestaurant);
        void onFailure();
    }

    // 2 - Public method to start fetching users following by Jake Wharton
    public static void fetchNearbyRestaurant(Callbacks callbacks, String location){

        // 2.1 - Create a weak reference to callback (avoid memory leaks)
        final WeakReference<Callbacks> callbacksWeakReference = new WeakReference<Callbacks>(callbacks);

        // 2.2 - Get a Retrofit instance and the related endpoints
        MapAPIService mMapAPIService = MapAPIService.retrofit.create(MapAPIService.class);

        // 2.3 - Create the call on Google Maps API
        Call<NearbyRestaurant> call = mMapAPIService.getNearby(location, "restaurant", 200, BuildConfig.MAPS_API_KEY);
        // 2.4 - Start the call
        call.enqueue(new Callback<NearbyRestaurant>() {

            @Override
            public void onResponse(@NotNull Call<NearbyRestaurant> call, @NotNull Response<NearbyRestaurant> response) {
                // 2.5 - Call the proper callback used in controller (MainFragment)
                if (callbacksWeakReference.get() != null) callbacksWeakReference.get().onResponse(response.body());
            }

            @Override
            public void onFailure(@NotNull Call<NearbyRestaurant> call, @NotNull Throwable t) {
                // 2.5 - Call the proper callback used in controller (MainFragment)
                if (callbacksWeakReference.get() != null) callbacksWeakReference.get().onFailure();
            }
        });
    }
}
