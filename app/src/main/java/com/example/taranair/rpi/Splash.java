package com.example.taranair.rpi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    int secondsDelayed = 1;
    Handler handler = new Handler();
    handler.postDelayed(new Runnable() {
        public void run () {
            startActivity(new Intent(Splash.this, MainActivity.class));
            finish();
        }

    }

    ,secondsDelayed*1000);
}
}


