package com.example.appnumbershapes;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    class Number {

        boolean isTriangularNumber(int num){

            int calc_num = 8*num+1;
            int t = (int) Math.sqrt(calc_num);

            if (t*t==calc_num) {
                return true;

            } else {
                return false;
            }
        }

        boolean isSquareNumber(int num) {

            for (int i = 0; i < num / 2 + 2; i++){
                if (i * i == num){
                    return true;
                }
            }
            return false;
        }

    }


    @SuppressLint("SetTextI18n")
    public void checkNumber(View view){

        EditText enteredNumberEditText = findViewById(R.id.enteredNumberEditText);

        if (enteredNumberEditText.getText().toString().isEmpty()){
            enteredNumberEditText.setError("Please enter a number!");
        }

        else {
            int enteredNumber = Integer.parseInt(enteredNumberEditText.getText().toString());
            TextView isSquare = findViewById(R.id.isSquareTextView);
            TextView isTriangular = findViewById(R.id.isTriangularTextView);

            Number number = new Number();

            if (number.isSquareNumber(enteredNumber)) {
                isSquare.setText("Number " + enteredNumber + " is square!");
            } else {
                isSquare.setText("Number " + enteredNumber + " is NOT square!");
            }

            if (number.isTriangularNumber(enteredNumber)) {
                isTriangular.setText("Number " + enteredNumber + " is triangular!");
            } else {
                isTriangular.setText("Number " + enteredNumber + " is NOT triangular!");
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}