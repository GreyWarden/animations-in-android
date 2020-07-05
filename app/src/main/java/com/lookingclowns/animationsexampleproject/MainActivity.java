package com.lookingclowns.animationsexampleproject;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final long SHORT_ANIMATION_DURATION = 500;
    private final long MEDIUM_ANIMATION_DURATION = 1000;
    private final long LONG_ANIMATION_DURATION = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void fadeHandler (View view) {
        ImageView bartView = findViewById(R.id.bartView);
        bartView.animate().translationZBy(-1000).setDuration(SHORT_ANIMATION_DURATION);
        bartView.animate().translationYBy(1000).setDuration(MEDIUM_ANIMATION_DURATION);
        bartView.animate().translationXBy(-1500).setDuration(LONG_ANIMATION_DURATION);
    }
}