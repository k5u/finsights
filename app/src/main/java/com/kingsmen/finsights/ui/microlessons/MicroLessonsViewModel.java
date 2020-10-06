package com.kingsmen.finsights.ui.microlessons;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MicroLessonsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MicroLessonsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
