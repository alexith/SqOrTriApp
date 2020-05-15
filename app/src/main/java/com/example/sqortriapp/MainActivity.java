package com.example.sqortriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<integer> extends AppCompatActivity {

    public boolean showMeTheTruth(View view){

        final EditText[] enteredNumber = {findViewById(R.id.enteredNumber)};

         class someNumbers{

             int i = 1;
             int n = 1;
             int currentTriNumber = 1;
             int currentSqNumber = 1;

             someNumbers<integer>[] squareNumberList = new someNumbers[0];
             someNumbers<integer>[] triangularNumbersList = new someNumbers[0];

            for(n<=100){
                 currentSqNumber = n*n;
                 squareNumberList.add(currentSqNumber);
                 n++;
             }

            for(n<=100){
                 currentTriNumber = currentTriNumber + i;
                 triangularNumbersList.add(currentTriNumber);
                 n++;
            }
            public boolean isNumberSq() {
                if((squareNumberList.contains(enteredNumber)){
                    return true;
                }else{
                    return false;
                }
            }

            public boolean isTheNumberTri(){
                if((currentTriNumber.contains(enteredNumber)){
                    return true;
                }else{
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
