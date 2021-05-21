package com.repo.test_module_ui.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.repo.test_module_core.services.TestCore;
import com.repo.test_module_ui.R;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private Activity activity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialiseViews();
    }

    private void initialiseViews() {
        Log.i(TAG, "initialiseViews: method called on login activity..");
        TestCore.getInstance().getAuthService(activity);
    }
}