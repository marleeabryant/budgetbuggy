package com.example.knownames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private EditText emailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Intent intent = getIntent();
        String email = intent.getStringExtra(MainActivity.SIGNUP_MESSAGE);
        emailText = (EditText) findViewById(R.id.emailText);
        emailText.setText(email);
    }

}
