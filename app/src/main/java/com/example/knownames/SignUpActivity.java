package com.example.knownames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class SignUpActivity extends AppCompatActivity {
    public static final String EMAIL_MESSAGE = "com.company.budgetbuggy.MESSAGE";
    public static final String PASSWORD_MESSAGE = "com.company.budgetbuggy.MESSAGE";
    public static final String BUDGETAMT_MESSAGE = "com.company.budgetbuggy.MESSAGE";
    public static final String BUDGETTIME_MESSAGE = "com.company.budgetbuggy.MESSAGE";
    public static final String SHOPPINGTIME_MESSAGE = "com.company.budgetbuggy.MESSAGE";
    private EditText emailText;
    private EditText budgetAmtText;
    private EditText budgetTimeText;
    private EditText shoppingTimeText;
    private Button exit;
    private String email;
    private String password;
    private double budgetAmount;
    private int budgetTime;
    private int shoppingTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        budgetAmtText = (EditText) findViewById(R.id.budgetAmount);
        budgetTimeText = (EditText) findViewById(R.id.budgetTime);
        shoppingTimeText = (EditText) findViewById(R.id.shoppingTime);
        exit = (Button) findViewById(R.id.createAccount);

        Intent intent = getIntent();
        //takes in email on sign in page
        email = intent.getStringExtra(MainActivity.SIGNUP_MESSAGE);
        //takes in password on sign in page
        password = intent.getStringExtra(MainActivity.PASSWORD_MESSAGE);



    }

    public void createAc(View view){
        //take in budget amount
        budgetAmount = Double.parseDouble(budgetAmtText.getText().toString());
        //take in budget time
        budgetTime = Integer.parseInt(budgetTimeText.getText().toString());
        //take in shopping time
        shoppingTime = Integer.parseInt(shoppingTimeText.getText().toString());

        User user1 = new User(email, password);
        user1.setBudgetAmt(budgetAmount);
        user1.setBudgetPeriod(budgetTime);
        user1.setShopPeriod(shoppingTime);
        Intent accountHomeIntent = new Intent(this, CreateAccountActivity.class);
        accountHomeIntent.putExtra(EMAIL_MESSAGE, email);
        accountHomeIntent.putExtra(PASSWORD_MESSAGE, password);
        accountHomeIntent.putExtra(BUDGETAMT_MESSAGE, budgetAmount);
        accountHomeIntent.putExtra(BUDGETTIME_MESSAGE, budgetTime);
        accountHomeIntent.putExtra(SHOPPINGTIME_MESSAGE, shoppingTime);
        startActivity(accountHomeIntent);
    }

}
