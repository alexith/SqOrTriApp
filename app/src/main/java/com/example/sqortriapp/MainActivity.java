package com.example.sqortriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//This app is will let you know if a number is Square number or Triangular or both or none

public class MainActivity<integer> extends AppCompatActivity {
    class someNumber{
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

    public boolean showMeTheTruth(View view) {

        EditText enteredNumber = findViewById(R.id.enteredNumber);
        Number myNumber = new number();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
