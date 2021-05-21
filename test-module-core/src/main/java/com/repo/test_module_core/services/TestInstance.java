package com.repo.test_module_core.services;

import android.app.Activity;

public class TestInstance {
    public AuthService getAuthService(Activity activity){
        return new AuthService(activity);
    }
}
