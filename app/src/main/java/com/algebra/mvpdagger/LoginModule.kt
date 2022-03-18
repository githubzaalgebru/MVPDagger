package com.algebra.mvpdagger

import dagger.Module;
import dagger.Provides

@Module
public class LoginModule {

    @Provides
    fun providePresenter( model : MainActivityMVP.Model ) : MainActivityMVP.Presenter {
        return MyPresenter( model )
    }

    @Provides
    fun provideModel( repository: LoginRepository ) : MainActivityMVP.Model {
        return MyModel( repository )
    }

    @Provides
    fun provideLoginRepository( ) : LoginRepository {
        return MemoryRepository( )
    }
}