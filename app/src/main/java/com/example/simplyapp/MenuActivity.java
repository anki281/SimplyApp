package com.example.simplyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.simplyapp.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void launchMainMenu(View view) {
        Intent mainMenuIntent = new Intent(this, MenuActivity.class);
        startActivity(mainMenuIntent);
    }

    public void launchWeatherActivity(View view) {
        Intent weatherIntent = new Intent(this, WeatherActivity.class);
        startActivity(weatherIntent);
    }

    public void launchToDoActivity(View view) {
        Intent toDoIntent = new Intent(this,to_do_Page.class);
        startActivity(toDoIntent);
    }

    public void launchBulletJournalActivity(View view) {
        Intent bulletJournalIntent = new Intent(this, BulletJournalActivity.class);
        startActivity(bulletJournalIntent);
    }

    public void launchMeditationActivity(View view) {
        Intent meditationIntent = new Intent(this, MeditationActivity.class);
        startActivity(meditationIntent);
    }
}