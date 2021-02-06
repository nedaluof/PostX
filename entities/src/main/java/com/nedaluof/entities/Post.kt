package com.nedaluof.entities

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * Created by nedaluof on 2/6/2021.
 */
@Parcelize
data class Post(
    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val postId: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String
) : Parcelable
