package com.example.knownames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String SIGNUP_MESSAGE = "com.company.budgetbuggy.MESSAGE";
    public static final String PASSWORD_MESSAGE = "com.company.budgetbuggy.MESSAGE";
    private ImageView imageView;
    private EditText loginBox;
    private EditText passwordBox;
    private TextView signinView;
    private TextView signupView;
    private Button signupButton;
    private Button signinButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_View);
        signinView = (TextView) findViewById(R.id.signinView);
        signupView = (TextView) findViewById(R.id.signupView);
        loginBox = (EditText) findViewById(R.id.loginBox);
        passwordBox = (EditText) findViewById(R.id.passwordBox);
        signupButton = (Button) findViewById(R.id.signUpButton);
        signinButton = (Button) findViewById(R.id.signInButton);

    }

    public void enterAppSignUp(View view){
        Intent signUpIntent = new Intent(this, SignUpActivity.class);
        String email = loginBox.getText().toString();
        String password = passwordBox.getText().toString();
        signUpIntent.putExtra(SIGNUP_MESSAGE, email);
        signUpIntent.putExtra(PASSWORD_MESSAGE, password);
        startActivity(signUpIntent);
    }

    public void signUp(View view)
    {
            loginBox.setHint(R.string.emailHint);
            signinButton.setBackgroundColor(getResources().getColor(R.color.dullColor));
            signupButton.setBackgroundColor(getResources().getColor(R.color.brightColor));
    }

    public void signIn (View view)
    {
            loginBox.setHint(R.string.usernameHint);
            signupButton.setBackgroundColor(getResources().getColor(R.color.dullColor));
            signinButton.setBackgroundColor(getResources().getColor(R.color.brightColor));
    }

}
