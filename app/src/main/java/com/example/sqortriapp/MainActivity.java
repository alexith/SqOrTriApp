package com.example.sqortriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void showMeTheTruth(View view){

        EditText enteredNumber = (EditText) findViewById(R.id.enteredNumber);

    }

    public class someNumbers{
        int enteredNumbers;
    }

    someNumbers squareNumbers = new someNumbers();
    someNumbers triangularNumbers = new someNumbers();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
