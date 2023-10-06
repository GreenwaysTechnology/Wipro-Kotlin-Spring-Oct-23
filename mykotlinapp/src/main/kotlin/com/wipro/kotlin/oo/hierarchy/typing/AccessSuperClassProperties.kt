package com.wipro.kotlin.oo.hierarchy.typing

open class Account {
    open fun deposit(): Int {
        return 100
    }
}

class SavingsAccount : Account() {
    override fun deposit(): Int {
        return super.deposit().plus(1000)
    }
}

fun main() {
    var account:Account = SavingsAccount()
    println(account.deposit())
}