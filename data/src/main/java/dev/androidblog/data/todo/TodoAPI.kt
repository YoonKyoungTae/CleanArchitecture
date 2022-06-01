package dev.androidblog.data.todo

import retrofit2.Call
import retrofit2.http.GET

interface TodoAPI {

    @GET("todos/1")
    fun getTodo(): Call<TodoResponse>

}