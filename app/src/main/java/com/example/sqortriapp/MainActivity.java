package com.example.sqortriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;

//This app is will let you know if a number is Square number or Triangular or both or none

public class MainActivity<integer> extends AppCompatActivity {

    public boolean showMeTheTruth(View view){

        final EditText[] enteredNumber = {findViewById(R.id.enteredNumber)};

        class someNumbers<I> {

            //index no. for triNumberList
            private int i = 1;

            //index no. for triNumberList
            private int n = 1;

            /*assuming that initially the number is 1 for both list,
             after that increment is done after loop operation*/
            private int currentTriNumber = 1;
            private int currentSqNumber = 1;

            //in the class somenumbers we create two new distinc classes triangularNumbersList and squareNumberList
            private someNumbers[] triangularNumbersList = new someNumbers[0];
            private someNumbers[] squareNumberList = new someNumbers[0];


            /*loop till index reaches 100 and
            add all the current value related to that particular index to ArrayList*/


            for(i <= 100) {
                currentTriNumber = currentTriNumber + i;
                triangularNumbersList.add(currentTriNumber);
                n++;
            }

            for(n <= 100) {
                currentSqNumber = n * n;
                squareNumberList.add(currentSqNumber);
                n++;
            }


            //if the number entered by user in text field is in the list we'll give a toast notification for both list

            public boolean isTheNumberTri() {
                if(Arrays.asList(triangularNumbersList).contains(enteredNumber)){
                    return true;
                } else{
                    return false;
                    }
            }

            public boolean isNumberSq() {
                if (Arrays.asList(squareNumberList).contains(enteredNumber)) {
                    return true;
                } else {
                    return false;
                }
            }

            if(isNumberSq() == true){
                System.out.println(Toast.makeText(MainActivity.this, "The no. is Square", Toast.LENGTH_SHORT).show());
            } else{
                System.out.println(Toast.makeText(MainActivity.this, "The no. is not Square", Toast.LENGTH_SHORT).show());
            }

            if(isTheNumberTri() == true){
                System.out.println(Toast.makeText(MainActivity.this, "The no. is Triangular", Toast.LENGTH_SHORT).show());
            } else{
                System.out.println(Toast.makeText(MainActivity.this, "The no. is not Triangular", Toast.LENGTH_SHORT).show());
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
