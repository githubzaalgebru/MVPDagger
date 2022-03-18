package com.algebra.mvpdagger.root

import android.app.Application
import com.algebra.mvpdagger.LoginModule

class App : Application( ) {

    var component : ApplicationComponent? = null
        private set

    override fun onCreate() {
        super.onCreate( )

        component = DaggerApplicationComponent
                        .builder( )
                        .applicationModule( ApplicationModule( this ) )
                        .loginModule( LoginModule( ) )
                        .build( )
    }
}