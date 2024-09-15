package com.tecmilenio.actividad4.ui.focuschange;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FocusChangeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FocusChangeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is focus change fragment");

    }
    public LiveData<String> getText() {
        return mText;
    }

}