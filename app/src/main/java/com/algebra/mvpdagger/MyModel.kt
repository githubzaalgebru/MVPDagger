package com.algebra.mvpdagger

class MyModel( private val loginRepository: LoginRepository ) : MainActivityMVP.Model {
    override val user: User
        get( ) = loginRepository.getUser( )

    override fun createUser( firstName: String, lastName: String ) {
        loginRepository.saveUser( User( firstName, lastName ) )
    }
}