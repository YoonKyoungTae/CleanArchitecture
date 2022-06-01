package dev.androidblog.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import dev.androidblog.data.todo.TodoRemoteRepository
import dev.androidblog.domain.usecase.todo.TodoUseCase

//https://leveloper.tistory.com/205#recentComments 를 토대로함

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRequest = findViewById<Button>(R.id.btnRequest)
        val tvResponse = findViewById<TextView>(R.id.tvResponse)

        btnRequest.setOnClickListener {
            //todo 여기서 의존성 주입이 필요함
            TodoUseCase().getTodo()
        }
    }
}