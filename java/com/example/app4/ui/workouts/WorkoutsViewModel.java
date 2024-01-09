package com.example.app4.ui.workouts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkoutsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public WorkoutsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is workouts fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}