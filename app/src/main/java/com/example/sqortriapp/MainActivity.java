package com.example.sqortriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<squareNumber, eachNumber, triangularNumber, integer, currentNumber> extends AppCompatActivity {

    public boolean showMeTheTruth(View view){

        final EditText[] enteredNumber = {(EditText) findViewById(R.id.enteredNumber)};

         class someNumbers{

            int enteredNumbers;
            int currentNumber = 1;

            someNumbers squareNumbers = new someNumbers();
            someNumbers triangularNumbers = new someNumbers();

            squareNumber = currentNumber * currentNumber;

            triangularNumber = eachNumber + currentNumber;

            public boolean isNumberSq() {
                if (enteredNumber[0] == squareNumbers) {
                    return true;
                } else {
                    return false;
                }
            }

            public boolean isTheNumberTri(){
                if(enteredNumber[0] == triangularNumbers){
                    return true;
                } else {
                    return false;
                }
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
