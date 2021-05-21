package com.repo.example;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.repo.test_module_ui.ui.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Activity activity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseViews();
    }

    private void initialiseViews() {
        Log.i(TAG, "initialiseViews: method called on main activity..");
        Intent intent = new Intent(activity , LoginActivity.class);
        startActivityForResult(intent , 1001);
    }
}