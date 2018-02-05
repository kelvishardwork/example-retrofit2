package com.brakeel.exampleretrofit2.api;

import com.brakeel.exampleretrofit2.domain.UdacityCatalog;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Kelvis Borges on 05/02/2018.
 */

public interface UdacityService {

    public static final String BASE_URL = "https://www.udacity.com/public-api/v0/";

    @GET("courses")
    Call<UdacityCatalog> listCatalog();


}
