package com.blackpaws.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers("X-API-KEY:A8D7952-9NC44PX-JZT2EJ9-3VRD7JQ")
    @GET("movie?rating.kp=8-10&sortType=-1&sortField=votes.kp&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @Headers("X-API-KEY:A8D7952-9NC44PX-JZT2EJ9-3VRD7JQ")
    @GET("movie/{id}")
    Single<TrailerResponse> loadTrailers(@Path("id") int id);
}
