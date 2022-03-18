package com.algebra.mvpdagger

class MainActivityMVP {

    interface View {
        fun getFirstName( ) : String
        fun getLastName( ) : String
        fun setFirstName( firstName : String )
        fun setLastName( lastName : String )
        fun showInputError( )
        fun showUserSavedMessage( )
    }

    interface Model {
        val user : User
        fun createUser( firstName : String, lastName : String )
    }

    interface Presenter {
        fun setView( view : View )
        fun loginButtonClicked( )
        fun getCurrentUser( )
    }
}