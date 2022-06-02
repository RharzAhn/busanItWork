package com.example.app16.test2


import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface INetworkService {
    @GET("api/users")
    fun doGetUserList(@Query("page") page:String): Call<UserListModel>
    //일반적으로  retrofit2.http.Query 써줌

    @GET
    fun getAvatarImage(@Url url:String):Call<ResponseBody>
    //ResponseBody 에있는 데이터를 가지고 온다.
}