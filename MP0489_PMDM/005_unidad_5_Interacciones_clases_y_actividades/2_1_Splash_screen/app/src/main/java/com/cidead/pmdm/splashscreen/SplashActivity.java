package com.cidead.pmdm.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Establcemos la orientacion exclisiva de retrato
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                Intent mainItent=new Intent().setClass(SplashActivity.this,MainActivity.class);
                startActivity(mainItent);
                finish();
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,2000);
    }
}