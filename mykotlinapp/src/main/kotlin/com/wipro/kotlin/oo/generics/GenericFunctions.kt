package com.wipro.kotlin.oo.generics

interface Repository {
    //generic function
    fun <T> getById(id: T): T
    fun <E> getAll(): List<E>
}

class RepositoryImpl : Repository {
    override fun <T> getById(id: T): T {
        return  id ;
    }

    override fun <E> getAll(): List<E> {
        TODO("Not yet implemented")
    }

}

fun main() {
    var repository = RepositoryImpl()
    repository.getById<String>("test")
}