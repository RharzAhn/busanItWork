package com.example.app16.test2

import UserModel
import com.google.gson.annotations.SerializedName

data class UserListModel (
    var page:String,
    @SerializedName("per_page")
    var perPage: String,
    var total:String,
    @SerializedName("total_page")
    var totalPages:String,
    var data:List<UserModel>
        )

