package dev.androidblog.data.todo

import com.google.gson.annotations.SerializedName

/**
 * JSON 응답을 정의합니다.
 */
data class TodoResponse(
    @SerializedName("userId")
    private val userId: Int,

    @SerializedName("id")
    private val id: Int,

    @SerializedName("title")
    private val title: String
)
