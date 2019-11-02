package com.example.knownames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private EditText loginBox;
    private TextView signinView;
    private TextView signupView;
    private Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_View);
        signinView = (TextView) findViewById(R.id.signinView);
        signupView = (TextView) findViewById(R.id.signupView);
        loginBox = (EditText) findViewById(R.id.loginBox);
        loginButton = (Button) findViewById(R.id.loginButton);



    }

    public void signUp(View view)
    {
            loginBox.setHint(R.string.emailHint);
    }

    public void signIn (View view)
    {
            loginBox.setHint(R.string.usernameHint);
    }




}
