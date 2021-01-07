package com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.basemachinecodinginterviewtemplatejava.MachineCodingInterviewApplication;
import com.example.basemachinecodinginterviewtemplatejava.R;
import com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis.apiServices.ApiService;
import com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule.di.DaggerSampleComponent;
import com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule.di.SampleComponent;

import javax.inject.Inject;

public class SampleActivity extends AppCompatActivity {

    SampleComponent sampleComponent;

    @Inject
    SampleViewModel sampleViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleComponent = DaggerSampleComponent.builder().applicationComponent(
                ((MachineCodingInterviewApplication)getApplication()).getComponent()
        ).build();
    }
}