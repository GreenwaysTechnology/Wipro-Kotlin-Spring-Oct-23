package com.wipro.kotlin.functionalprogramming.dsl

var asyncTask = { action: (String) -> Unit ->
    action("async task")
}

var async = { payload: String, action: (String) -> Unit ->
    action(payload)
}

fun main() {
    asyncTask { println(it) }
    async("async payload") { println(it) }
}