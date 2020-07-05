package com.lookingclowns.animationsexampleproject;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final long FADE_DURATION = 2000;
    private boolean IS_BART_SHOWN = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fadeHandler (View view) {
        ImageView bartView = findViewById(R.id.bartView);
        ImageView homerView = findViewById(R.id.homerView);

        bartView.animate().alpha(this.IS_BART_SHOWN ? 0 : 1).setDuration(FADE_DURATION);
        homerView.animate().alpha(this.IS_BART_SHOWN ? 1 : 0).setDuration(FADE_DURATION);

        this.IS_BART_SHOWN = !this.IS_BART_SHOWN;
    }
}