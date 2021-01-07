package com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis.apiServices.ApiService;
import com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule.SampleActivity;
import com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule.SampleViewModel;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class SampleModule {

    SampleActivity sampleActivity;

    public SampleModule(SampleActivity sampleActivity) {
        this.sampleActivity = sampleActivity;
    }

    @Provides
    @SampleActivityScope
    ApiService apiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Provides
    @SampleActivityScope
    SampleViewModel sampleViewModel(){
        return new ViewModelProvider(sampleActivity).get(SampleViewModel.class);
    }

}
