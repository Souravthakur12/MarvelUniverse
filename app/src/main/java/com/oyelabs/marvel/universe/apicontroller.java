package com.oyelabs.marvel.universe;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apicontroller {

    private static final String url ="https://gateway.marvel.com:443/v1/public/";
    final  String PUBLIC_API_KEY= "61c7ce4c92ce906c7bdfa4f9adb18c54";
    final  String TS = "1";
    final  String hash = "9fb6b3413386250f84158573c60b783a";
    private static apicontroller clientobject;
    private static Retrofit retrofit;

    apicontroller()
    {
        retrofit = new Retrofit.Builder()
                        .baseUrl(url)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
    }

    public static synchronized apicontroller getInstance() {
        if (clientobject == null)

            clientobject = new apicontroller();

        return clientobject;

    }

    apiset getapi()
    {
        return retrofit.create(apiset.class);
    }

}
