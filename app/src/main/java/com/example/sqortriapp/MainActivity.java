package com.example.sqortriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<squareNumber, eachNumber, triangularNumber> extends AppCompatActivity {

    public boolean showMeTheTruth(View view){

        EditText enteredNumber = (EditText) findViewById(R.id.enteredNumber);

        public boolean isTheNumberTri(){
            if(enteredNumber = triangularNumbers){
                return true;
            } else {
                return false;
            }
        }

        public boolean isNumberSq(){
            if(enteredNumber = squareNumbers){
                return true;
            } else {
                return false;
            }
        }

    }

    public class someNumbers{

        int enteredNumbers;
        int eachNumber;

    }

    someNumbers squareNumbers = new someNumbers();
    someNumbers triangularNumbers = new someNumbers();

    squareNumber = eachNumber * eachNumber;

    triangularNumber = eachNumber + 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
