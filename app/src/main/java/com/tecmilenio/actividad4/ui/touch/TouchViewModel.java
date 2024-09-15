package com.tecmilenio.actividad4.ui.touch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TouchViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TouchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is touch fragment");

    }
    public LiveData<String> getText() {
        return mText;
    }
}