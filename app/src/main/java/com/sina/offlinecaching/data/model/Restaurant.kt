package com.sina.offlinecaching.data.model


import com.google.gson.annotations.SerializedName

data class Restaurant(
    @SerializedName("address")
    val address: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("hours")
    val hours: Hours?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("phone_number")
    val phoneNumber: String?,
    @SerializedName("review")
    val review: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("uid")
    val uid: String?
)