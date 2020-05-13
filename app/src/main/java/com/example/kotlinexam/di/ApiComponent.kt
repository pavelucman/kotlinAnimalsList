package com.example.kotlinexam.di

import com.example.kotlinexam.model.AnimalApiService
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: AnimalApiService)


}