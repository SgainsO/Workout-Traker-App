package com.zybooks.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.zybooks.myapplication.ui.weight.*;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mWelcome;
    private final MutableLiveData<String> mProgress;
    private final MutableLiveData<String> mRecWeight;
    private final MutableLiveData<String> mLatLift;
    private final MutableLiveData<String> mProgWeight;

    private MutableLiveData<String> mRecWeightValue;
    private MutableLiveData<String> mLatLiftValue;
    private MutableLiveData<String> mProgWeightValue;

    public HomeViewModel() {
        mWelcome = new MutableLiveData<>();
        mWelcome.setValue("Welcome back!");

        mProgress = new MutableLiveData<>();
        mProgress.setValue("Let's review your recent progress:");

        mRecWeight = new MutableLiveData<>();
        mRecWeight.setValue("Most Recent Weight:");

        mLatLift = new MutableLiveData<>();
        mLatLift.setValue("Latest Lift Increased:");

        mProgWeight = new MutableLiveData<>();
        mProgWeight.setValue("Progress to Goal Weight:");

        mRecWeightValue = new MutableLiveData<>();
        mRecWeightValue.setValue("lbs");

        mLatLiftValue = new MutableLiveData<>();
        mLatLiftValue.setValue("");

        mProgWeightValue = new MutableLiveData<>();
        mProgWeightValue.setValue("%");
    }

    public LiveData<String> welcomeGetText() {
        return mWelcome;
    }
    public LiveData<String> progressGetText() {
        return mProgress;
    }
    public LiveData<String> recWeightGetText() {
        return mRecWeight;
    }
    public LiveData<String> latLiftGetText() {
        return mLatLift;
    }
    public LiveData<String> progWeightGetText() {
        return mProgWeight;
    }
}