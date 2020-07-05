package com.lookingclowns.animationsexampleproject;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final long MEDIUM_ANIMATION_DURATION = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bartView = findViewById(R.id.bartView);
        bartView.setX(-1500);
        bartView.animate().translationXBy(1500).rotation(3600).setDuration(MEDIUM_ANIMATION_DURATION);
    }

    public void fadeHandler (View view) {
        ImageView bartView = findViewById(R.id.bartView);
        bartView.animate().translationXBy(-1500).scaleX(0.5f).scaleY(0.5f)
                .rotation(-3600).alpha(0)
                .setDuration(MEDIUM_ANIMATION_DURATION);
    }
}