package com.tecmilenio.actividad4.ui.longclick;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LongClickViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LongClickViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is long click fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}