package com.tecmilenio.actividad4.ui.click;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClickViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ClickViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is click fragment");

    }
    public LiveData<String> getText() {
        return mText;
    }
}