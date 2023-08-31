package com.sina.offlinecaching.data.model


import com.google.gson.annotations.SerializedName

data class Wednesday(
    @SerializedName("closes_at")
    val closesAt: String?,
    @SerializedName("is_closed")
    val isClosed: Boolean?,
    @SerializedName("opens_at")
    val opensAt: String?
)