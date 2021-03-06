package com.example.sqortriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//This app will let you know if a number is Square, Triangular, both or none. 

public class MainActivity<integer> extends AppCompatActivity {

    public void showMeTheTruth(View view) {

        EditText enteredNumber = findViewById(R.id.enteredNumber);
        String message = "";

        if(enteredNumber.getText().toString().isEmpty()){
            message = "please enter a number!";
        }

        Log.i("userEnteredNumber", enteredNumber.getText().toString());
        Number myNumber = new Number();

        myNumber.number = Integer.parseInt(enteredNumber.getText().toString());

        if (myNumber.isNumberSquare()){
            if (myNumber.isTriangularNumber()){
                message = myNumber.number + " is both tri and sq";
            } else {
                message = myNumber.number + " is Square, but not triangular.";
            }
        } else {
            if(myNumber.isTriangularNumber()){
                message = myNumber.number + " is tri, but not square";
            } else{
                message = myNumber.number + " neither square nor triangular.";
            }
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
    class Number{
        int number;
        public boolean isTriangularNumber() {
            int x = 1;
            int triangularNumber = 1;

            while(triangularNumber < number){
                x++;
                triangularNumber = triangularNumber + 1;
            }
            if(triangularNumber == number){
                return true;
            } else{
                return false;
            }
        }
        public boolean isNumberSquare(){
            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {
                return true;
            } else {
                return false;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
