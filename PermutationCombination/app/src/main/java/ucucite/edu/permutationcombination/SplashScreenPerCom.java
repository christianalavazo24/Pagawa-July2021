package ucucite.edu.permutationcombination;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenPerCom extends Activity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_per_com);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent=new Intent(SplashScreenPerCom.this,MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}