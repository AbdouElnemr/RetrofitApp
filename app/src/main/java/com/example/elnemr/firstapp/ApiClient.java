package com.example.elnemr.firstapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Elnemr on 4/21/2018.
 */

public class ApiClient {

    // used to get instance of retrofit

    public static final String BASE_URL = "http://192.168.1.4/ContactsJson/"; // the base url of the json
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){ // to create the retrofit instance

        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}