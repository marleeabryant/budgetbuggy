package com.example.knownames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.knownames.User;

public class CreateAccountActivity extends AppCompatActivity {



    private String email1;
    private String budgetAmount1;
    private String budgetTime1;
    private String shoppingTime1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        Intent intent = getIntent();

        email1 = intent.getStringExtra(SignUpActivity.EMAIL_MESSAGE);
        budgetAmount1 = intent.getStringExtra(SignUpActivity.BUDGETAMT_MESSAGE);
        budgetTime1 = intent.getStringExtra(SignUpActivity.BUDGETTIME_MESSAGE);
        shoppingTime1 = intent.getStringExtra(SignUpActivity.SHOPPINGTIME_MESSAGE);




    }
}
