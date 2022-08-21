package com.sergnfitness.android.fit.di

import com.sergnfitness.android.fit.presentation.activity.MainActivity
import com.sergnfitness.android.fit.presentation.part1.Pg1MaleFemale
import dagger.Component

@Component(modules = [AppModule::class, DomainModule::class, DataModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(pg1MaleFemale: Pg1MaleFemale)
}