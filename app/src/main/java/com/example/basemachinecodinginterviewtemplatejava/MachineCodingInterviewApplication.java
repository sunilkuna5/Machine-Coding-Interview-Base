package com.example.basemachinecodinginterviewtemplatejava;

import android.app.Application;

import com.example.basemachinecodinginterviewtemplatejava.repositories.db.DBModule;
import com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis.NetworkModule;

public class MachineCodingInterviewApplication extends Application {

    ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .networkModule(new NetworkModule())
                .dBModule(new DBModule(this))
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
