package com.algebra.mvpdagger

class MyPresenter( val model : MainActivityMVP.Model ) : MainActivityMVP.Presenter {

    private var view : MainActivityMVP.View? = null

    override fun setView( view : MainActivityMVP.View ) {
        this.view = view
    }

    override fun loginButtonClicked( ) {
        val firstName = view!!.getFirstName( ).trim( )
        val lastName  = view!!.getLastName( ).trim( )
        if( firstName!="" && lastName!="" ) {
            model.createUser( firstName, lastName )
            view!!.showUserSavedMessage( )
        } else
            view!!.showInputError( )

    }

    override fun getCurrentUser( ) {
        val currentUser = model.user

        view!!.setFirstName( currentUser.firstName )
        view!!.setLastName( currentUser.lastName )
    }
}