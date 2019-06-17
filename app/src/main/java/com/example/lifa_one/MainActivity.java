package com.example.lifa_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mMainTitle;
    private Button mProceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainTitle = (TextView) findViewById(R.id.maintitle);
        mProceed = (Button) findViewById(R.id.buttonProceed);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Amadeus.ttf");
        mMainTitle.setTypeface(font);


        mProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, formActivity.class);
                startActivity(intent);
            }
        });
    }
}
