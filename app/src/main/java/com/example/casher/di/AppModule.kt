package com.example.casher.di

import android.content.Context
import androidx.annotation.Keep
import com.example.casher.BuildConfig
import com.example.casher.model.remote.ApiService
import com.example.casher.model.remote.ServiceGenerator
import com.example.casher.model.repository.CheckRepository
import com.example.casher.model.repository.CheckRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Base app dependency injection module
 *
 * @author EvgenySamarin
 * @since 2019.12.10 v1
 */
@Module
@Keep
class AppModule (private val context: Context) {
    @Provides
    @Singleton
    fun provideAppContext(): Context = context

    @Singleton
    @Provides
    fun provideApiService(context: Context): ApiService =
        ServiceGenerator.makeService(BuildConfig.DEBUG, context)

    @Provides
    @Singleton
    fun provideRepository(apiService: ApiService): CheckRepository =
        CheckRepositoryImpl(apiService)
}