package com.oyelabs.marvel.universe;

import com.oyelabs.marvel.universe.Model.Characters;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface apiset {


    @GET("characters")
    Call<List<Characters>>getData(@Query("TS")String ts,
                                  @Query("apikey") String PUBLIC_API_KEY,
                                  @Query("hash") String hash);


    @GET("characters/{characterId}")
    Call<List<Characters>>getCharacter(@Query("TS")String ts,
                                  @Query("apikey") String PUBLIC_API_KEY,
                                  @Query("hash") String hash);

}
