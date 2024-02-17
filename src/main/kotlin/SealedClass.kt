fun main() {

    val success = Result.Success("SUCCESS")
    val progress = Result.InProgress("IN PROGRESS")

    getData(success)
    getData(progress)
}

sealed class Result(private val message: String) {

    class Success(message: String) : Result(message)
    class InProgress(message: String) : Result(message)
    sealed class Error(message: String) : Result(message) {
        class RecoverableError(exception: Exception, message: String) : Error(message)
        class NonRecoverableError(exception: Exception, message: String) : Error(message)
    }

    fun showMessage() {
        println("Result: $message")
    }
}

fun getData(result: Result) {

    when (result) {
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
        is Result.InProgress -> result.showMessage()
        is Result.Success -> result.showMessage()
    }
}