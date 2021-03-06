package com.example.myparcelapp.service

import com.example.myparcelapp.model.ProductVOList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TodayDealService {
    @GET("/todaydeal_json")
    fun todayDealList() : Call<ProductVOList>

    @GET("/searchresult_json")
    fun searchResultList(@Query("sch") searchword:String,
                         @Query("flt") filter:String,
                         @Query("st") star:String,
                         @Query("tag") tag:String,
                         @Query("br") brand:String,
                         @Query("agn") align:String) : Call<ProductVOList>
}