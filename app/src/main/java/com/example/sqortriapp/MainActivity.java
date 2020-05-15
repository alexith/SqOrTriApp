package com.example.sqortriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<squareNumber, eachNumber, triangularNumber, integer, currentNumber> extends AppCompatActivity {

    public boolean showMeTheTruth(View view){

        final EditText[] enteredNumber = {(EditText) findViewById(R.id.enteredNumber)};

         class someNumbers<I> {

             int i = 1;
             int n = 1;
             int currentTriNumber = 1;
             int currentSqNumber = 1;


            someNumbers<integer>[] triangularNumbersList = new someNumbers[0];

            for(n<=100){
                 currentSqNumber = n*n;
                 squareNumberList.add(currentSqNumber);
                 n++;
             }

            someNumbers<integer>[] squareNumberList = new someNumbers[0];

            for(n<=100){
                 currentTriNumber = currentTriNumber + i;
                 currentTriNumber.add(currentTriNumber);
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
