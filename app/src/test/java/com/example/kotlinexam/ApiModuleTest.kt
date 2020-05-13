package com.example.kotlinexam

import com.example.kotlinexam.di.ApiModule
import com.example.kotlinexam.model.AnimalApiService

class ApiModuleTest(val mockService: AnimalApiService): ApiModule() {

    override fun provideAnimalApiService(): AnimalApiService {
        return mockService
    }
}