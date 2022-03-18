package com.algebra.mvpdagger

class MemoryRepository : LoginRepository {

    private var user : User? = null

    override fun getUser( ) : User {
        return if( user==null ) {
            User( "Fox", "Mulder" )
        } else
            user as User
    }

    override fun saveUser( user: User ) {
        this.user = user
    }
}