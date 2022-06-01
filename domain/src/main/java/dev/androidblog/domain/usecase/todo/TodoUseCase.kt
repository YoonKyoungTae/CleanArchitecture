package dev.androidblog.domain.usecase.todo

class TodoUseCase(private val repo: TodoRepository) {

    fun getTodo(): String {
        return repo.getTodo()
    }

}