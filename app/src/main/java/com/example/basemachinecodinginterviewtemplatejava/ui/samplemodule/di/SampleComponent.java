package com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule.di;

import com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis.ApplicationComponent;
import com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule.SampleActivity;

import dagger.Component;

@SampleActivityScope
@Component(dependencies = ApplicationComponent.class, modules = SampleModule.class)
public interface SampleComponent {
    void inject(SampleActivity activity);
}
