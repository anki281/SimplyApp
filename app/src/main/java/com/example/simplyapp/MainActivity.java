package com.example.simplyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.simplyapp.MenuActivity;
import com.example.simplyapp.R;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchMainMenu(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}