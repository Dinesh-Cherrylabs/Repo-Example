package com.repo.test_module_core.services;

import android.util.Log;

public class TestCore {
    private static final String TAG = "TestCore";
    public TestCore() {
        Log.i(TAG, "TestCore: method called..");
    }

    public static TestInstance getInstance(){
        return new TestInstance();
    }
}
