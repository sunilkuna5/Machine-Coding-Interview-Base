package com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule.di;

import com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis.apiServices.ApiService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class SampleModule {

    @Provides
    @SampleActivityScope
    ApiService apiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

}
