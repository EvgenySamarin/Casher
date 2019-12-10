package com.example.casher.view

import android.app.Application
import androidx.annotation.Keep
import com.example.casher.di.AppModule
import com.example.casher.view.ui.main.MainActivity
import com.example.casher.view.ui.main.fragments.MainFragment
import com.example.casher.viewmodel.MainViewModel
import dagger.Component
import timber.log.Timber
import javax.inject.Singleton

/**
 * Start point for initialize libraries component such as dagger, timber and other
 *
 * @author EvgenySamarin
 * @since 2019.12.10 v1
 */
@Keep
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this)).build()

        /** TODO [2019.12.08] добавь систему предоставления зависимостей */
        /** TODO [2019.12.08] добавь логи от Вортаныча */
    }

    companion object {
        lateinit var appComponent: AppComponent
    }
}

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent{
    //activities
    fun inject(activity: MainActivity)

    //fragments
    fun inject(fragment: MainFragment)

    fun inject(mainViewModel: MainViewModel)
}