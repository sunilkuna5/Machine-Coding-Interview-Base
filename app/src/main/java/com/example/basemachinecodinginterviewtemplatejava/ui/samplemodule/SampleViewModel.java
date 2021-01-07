package com.example.basemachinecodinginterviewtemplatejava.ui.samplemodule;

import androidx.lifecycle.ViewModel;

import com.example.basemachinecodinginterviewtemplatejava.repositories.remoteapis.apiServices.ApiService;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class SampleViewModel extends ViewModel {
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCleared() {
        super.onCleared();
        compositeDisposable.clear();
    }
}
