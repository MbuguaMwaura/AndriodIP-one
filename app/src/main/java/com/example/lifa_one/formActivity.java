package com.example.lifa_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class formActivity extends AppCompatActivity {
    private EditText mFirstname;
    private EditText mLastName;
    private EditText mEmail;
    private Button mSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        mFirstname = (EditText) findViewById(R.id.firstName);
        mLastName = (EditText) findViewById(R.id.lastName);
        mEmail = (EditText) findViewById(R.id.email);
        mSignIn = (Button) findViewById(R.id.signIn);



            mSignIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mFirstname.getText().toString().isEmpty() || mLastName.getText().toString().isEmpty() || mEmail.getText().toString().isEmpty() ) {

                        Toast.makeText(formActivity.this, "Please fill in all the fields in the form", Toast.LENGTH_LONG).show();
                    } else {
                        Intent intent = new Intent(formActivity.this, WelcomeActivity.class);

                        String firstName = mFirstname.getText().toString();
                        String lastName = mLastName.getText().toString();
                        String email = mEmail.getText().toString();

                        intent.putExtra("firstName", firstName);
                        intent.putExtra("lastName", lastName);
                        intent.putExtra("email", email);

                        startActivity(intent);
                    }
                }
            });


        }
    }


