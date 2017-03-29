package com.example.rattlytocho.splashscreen;

/**
 * Created by rattlytocho on 23/03/17.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.view.WindowManager;


public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //Redireccionar a la actividad principal despues del tiempo establecido defualt : 3 seg
        new CountDownTimer(3000,1000) {
            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
            @Override
            public void onTick(long millisUntilFinished) {
            }
        }.start();
    }
}