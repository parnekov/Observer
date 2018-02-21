package com.parnekov.sasha.observer;

import android.os.Handler;

import java.util.Observable;


public class UserDataRepository extends Observable {
    private String mName;
    private int mAge;

    private static UserDataRepository INSTANCE = null;

    private UserDataRepository() {
        getNewDataFromRemote();
    }

    // Returns a single instance of this class, creating it if necessary.
    public static UserDataRepository getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new UserDataRepository();
        }
        return INSTANCE;
    }


    // Simulate network
    private void getNewDataFromRemote() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setUserData("Parniekov Sasha", 28);
            }
        }, 10000);
    }

    public void setUserData(String fullName, int age) {
        mName = fullName;
        mAge = age;
        setChanged();
        notifyObservers();
    }

    public String getFullName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }

}
