package com.example.basemachinecodinginterviewtemplatejava;

import android.app.Application;

import com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis.ApplicationComponent;
import com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis.DaggerApplicationComponent;

public class MachineCodingInterviewApplication extends Application {

    ApplicationComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
