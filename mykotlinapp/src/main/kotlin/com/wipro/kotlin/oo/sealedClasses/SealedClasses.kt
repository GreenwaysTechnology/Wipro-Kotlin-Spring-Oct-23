package com.wipro.kotlin.oo.sealedClasses

//Sealed classes
sealed class MyResult {
    data class Success(val resolve: String) : MyResult()
    data class Failure(val reject: String) : MyResult()
    class Loader() : MyResult()
}

// api which returns sealad class
fun getSuccess(): MyResult {
    return MyResult.Success("Data is available")
}

fun getFailure(): MyResult {
    return MyResult.Failure("Something is went wrong")
}

//all in one
fun fetch(): MyResult {
    var status = 200
    if (status === 200)
        return MyResult.Success("Response found")
    return MyResult.Failure("failed")
}


fun main() {
    var success = getSuccess()
    when (success) {
        is MyResult.Success -> {
            println(success.resolve)
        }
        is MyResult.Failure -> {
            println(success.reject)
        }
        else -> {
            println("Loading")
        }
    }
    var failure = getFailure()
    when (failure) {
        is MyResult.Success -> {
            println(failure.resolve)
        }
        is MyResult.Failure -> {
            println(failure.reject)
        }
        else -> {
            println("Loading")
        }
    }

    var response = fetch()
    when (response) {
        is MyResult.Success -> {
            println(response.resolve)
        }
        is MyResult.Failure -> {
            println(response.reject)
        }
        else -> {
            println("Loading")
        }
    }
}