package com.algebra.mvpdagger.root

import com.algebra.mvpdagger.LoginModule
import com.algebra.mvpdagger.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component( modules = [ApplicationModule::class, LoginModule::class] )
interface ApplicationComponent {
    fun inject( target : MainActivity )
}