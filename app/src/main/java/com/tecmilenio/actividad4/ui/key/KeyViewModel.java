package com.tecmilenio.actividad4.ui.key;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KeyViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public KeyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is key fragment");

    }
    public LiveData<String> getText() {
        return mText;
    }

}