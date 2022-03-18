package com.algebra.mvpdagger

interface LoginRepository {
    fun getUser( ) : User
    fun saveUser( user : User )
}