package com.example.sqortriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<squareNumber, eachNumber, triangularNumber, integer, currentNumber> extends AppCompatActivity {

    public boolean showMeTheTruth(View view){

        final EditText[] enteredNumber = {(EditText) findViewById(R.id.enteredNumber)};

         class someNumbers {

             int i;
             int n;
             int currentTriNumber;
             int currentSqNumber;


            someNumbers[] triangularNumbersList = new someNumbers[0];
            someNumbers[] squareNumberList = new someNumbers[0];

            for(n<=100){
                currentSqNumber;
                squareNumberList.add(currentSqNumber * currentSqNumber);
                n++;

             }
             someNumbers() {
                 triangularNumber = triangularNumber + currentTriNumber;
             }


             public boolean isNumberSq() {
                if (squareNumber.contains(enteredNumber)) {
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
