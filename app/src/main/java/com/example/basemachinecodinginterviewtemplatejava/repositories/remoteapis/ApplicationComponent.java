package com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis;

import com.example.basemachinecodinginterviewtemplatejava.MachineCodingInterviewApplication;
import com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule.SampleActivity;

import dagger.Component;
import retrofit2.Retrofit;

@ApplicationScope
@Component(modules = ApiServiceModule.class)
public interface ApplicationComponent {

    Retrofit getRetrofit();

    void inject(MachineCodingInterviewApplication application);
}
