package com.example.lifa_one;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mMainTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainTitle = (TextView) findViewById(R.id.maintitle);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Amadeus.ttf");
        mMainTitle.setTypeface(font);

    }
}
