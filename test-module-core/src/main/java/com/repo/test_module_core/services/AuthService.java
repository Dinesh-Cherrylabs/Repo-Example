package com.repo.test_module_core.services;

import android.app.Activity;
import android.util.Log;

public class AuthService {
    private static final String TAG = "AuthService";
    private Activity activity;

    public AuthService(Activity activity) {
        this.activity = activity;
    }

    void authenticate() {
        Log.i(TAG, "authenticate: method called..");
    }
}
