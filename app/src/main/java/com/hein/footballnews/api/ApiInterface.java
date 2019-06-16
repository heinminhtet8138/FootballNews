package com.hein.footballnews.api;

import com.hein.footballnews.models.Responses;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("top-headlines")
    Call<Responses> getNews (
            @Query("category") String category,
            @Query("q") String keyword,
            @Query("apiKey") String apiKey
    );

    @GET("top-headlines")
    Call<Responses> getNewsSearch(
            @Query("category") String keyword,
            @Query("language") String language,
            @Query("apiKey") String apiKey
    );
}
