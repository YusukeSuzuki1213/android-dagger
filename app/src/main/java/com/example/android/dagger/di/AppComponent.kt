package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

// Definition of a Dagger component
@Component(modules = [StorageModule::class])
interface AppComponent {

    // AppComponentのインスタンスを作成するファクトリー
    @Component.Factory
    interface Factory {
        // @BindsInstanceを使用すると、渡されたコンテキストはグラフで利用可能に
        fun create(@BindsInstance context: Context): AppComponent
    }

    // RegistrationActivityがInjectを要求している
    fun inject(activity: RegistrationActivity)
}