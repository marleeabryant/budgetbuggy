package com.example.knownames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private EditText editText;
    private TextView textView;
    private int imagePicker = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_View);
        editText = (EditText) findViewById(R.id.edit_Text);

    }

    public void changePicRight(View view) {
        textView.setTextColor(getResources().getColor(R.color.resetColor));
        if(imagePicker == 1){imageView.setImageResource(R.drawable.profile2);}
        if(imagePicker == 2){imageView.setImageResource(R.drawable.profile3);}
        if(imagePicker == 3){imageView.setImageResource(R.drawable.profile1);}
        imagePicker++;
        if (imagePicker == 4){
            imagePicker = 1;
        }
    }

    public void changePicLeft(View view) {
        textView.setTextColor(getResources().getColor(R.color.resetColor));
        if(imagePicker == 1){imageView.setImageResource(R.drawable.profile3);}
        if(imagePicker == 2){imageView.setImageResource(R.drawable.profile1);}
        if(imagePicker == 3){imageView.setImageResource(R.drawable.profile2);}
        imagePicker--;
        if (imagePicker == 0){
            imagePicker = 3;
        }
    }

    public void checkPic(View view) {
        if (imagePicker == 1){
            if(editText.getText().toString().equals("Sarah")){
                textView.setText(R.string.resultString2);
                textView.setTextColor(getResources().getColor(R.color.colorPrimary));
            } else {
                textView.setText(R.string.resultString1);
                textView.setTextColor(getResources().getColor(R.color.resultColor));
            }
        }
        if (imagePicker == 2){
            if(editText.getText().toString().equals("Larry")){
                textView.setText(R.string.resultString2);
                textView.setTextColor(getResources().getColor(R.color.colorPrimary));
            } else {
                textView.setText(R.string.resultString1);
                textView.setTextColor(getResources().getColor(R.color.resultColor));
            }
        }
        if (imagePicker == 3){
            if(editText.getText().toString().equals("Samantha")){
                textView.setText(R.string.resultString2);
                textView.setTextColor(getResources().getColor(R.color.colorPrimary));
            } else {
                textView.setText(R.string.resultString1);
                textView.setTextColor(getResources().getColor(R.color.resultColor));
            }
        }
    }

}
