package com.algebra.mvpdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.algebra.mvpdagger.root.App
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity( ), MainActivityMVP.View {

    @Inject
    lateinit var presenter : MainActivityMVP.Presenter

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        ( application as App ).component?.inject( this )
        // initObjects( )

        bLogin.setOnClickListener {
            presenter.loginButtonClicked( )
        }

        bCurrentUser.setOnClickListener {
            presenter.getCurrentUser( )
        }
    }

    override fun onResume( ) {
        super.onResume( )
        presenter.setView( this )
    }

/*
Koristili smo za punjenje objekata prije upotrebe Dagger-a
    fun initObjects( ) {
        val repository = MemoryRepository( )
        val model = MyModel( repository )
        this.presenter = MyPresenter( model )
        this.presenter.setView( this )
    }
*/


    override fun getFirstName( ) = etFirstName.text.toString( )
    override fun getLastName( ) = etLastName.text.toString( )
    override fun setFirstName( firstName : String ) {
        etFirstName.setText( firstName )
    }
    override fun setLastName( lastName : String ) {
        etLastName.setText( lastName )
    }

    override fun showInputError( ) {
        Toast
            .makeText( this, "Values for names must be entereed", Toast.LENGTH_SHORT )
            .show( )
    }

    override fun showUserSavedMessage( ) {
        Toast
            .makeText( this, "User saved", Toast.LENGTH_SHORT )
            .show( )
    }
}