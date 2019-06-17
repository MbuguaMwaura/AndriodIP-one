package com.example.lifa_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private TextView mWelcome;
    private Button mEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mWelcome = (TextView) findViewById(R.id.welcome);
        mEvents = (Button) findViewById(R.id.events);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String email = intent.getStringExtra("email");



        mWelcome.setText("Hey there " + firstName + ", welcome to Life.Is.Freaking.Awesome. Click the button below and" +
                " explore the amazing events you MUST attend!");
    }
}
