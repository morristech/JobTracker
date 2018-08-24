package com.nerdery.rtaza.mvvmdemo.di.component

import android.app.Application
import com.nerdery.rtaza.mvvmdemo.di.module.ApplicationModule
import com.nerdery.rtaza.mvvmdemo.di.module.HttpModule
import com.nerdery.rtaza.mvvmdemo.di.module.PersistenceModule
import com.nerdery.rtaza.mvvmdemo.di.module.ViewModelModule
import com.nerdery.rtaza.mvvmdemo.ui.MvvmDemoApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class,
        PersistenceModule::class,
        HttpModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: MvvmDemoApplication)
}