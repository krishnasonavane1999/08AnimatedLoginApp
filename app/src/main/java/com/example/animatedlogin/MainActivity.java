package com.example.animatedlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.AppLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) layout.getBackground();

        animationDrawable.setEnterFadeDuration(1000);

        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();
    }
}
