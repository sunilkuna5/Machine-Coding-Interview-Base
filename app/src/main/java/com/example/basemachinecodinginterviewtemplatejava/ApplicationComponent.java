package com.example.basemachinecodinginterviewtemplatejava;

import com.example.basemachinecodinginterviewtemplatejava.repositories.db.DBModule;
import com.example.basemachinecodinginterviewtemplatejava.repositories.db.SampleDatabase;
import com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis.NetworkModule;

import dagger.Component;
import retrofit2.Retrofit;

@ApplicationScope
@Component(modules = {NetworkModule.class, DBModule.class})
public interface ApplicationComponent {

    Retrofit getRetrofit();

    SampleDatabase getDatabase();

    void inject(MachineCodingInterviewApplication application);
}
