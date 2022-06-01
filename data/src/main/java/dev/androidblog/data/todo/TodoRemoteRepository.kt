package dev.androidblog.data.todo

import android.util.Log
import dev.androidblog.data.common.RetrofitClient
import dev.androidblog.domain.usecase.todo.TodoRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TodoRemoteRepository: TodoRepository {

    //todo usecase에 있는 실제 구현체
    override fun getTodo(): String {
        RetrofitClient.retrofit.create(TodoAPI::class.java).getTodo().enqueue(object : Callback<TodoResponse> {
            override fun onResponse(call: Call<TodoResponse>, response: Response<TodoResponse>) {
                Log.d("TEST", "onResponse : ${response.body()}")
            }

            override fun onFailure(call: Call<TodoResponse>, t: Throwable) {
                Log.d("TEST", "onFailure : ${t.message}")
            }
        })

        return "응답입니다."
    }
}