package com.pradeep.roomdatabaseretrofit.Network;

import com.pradeep.roomdatabaseretrofit.Modal.UserDetail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("users")
    Call<List<UserDetail>> getAllActors();
}
