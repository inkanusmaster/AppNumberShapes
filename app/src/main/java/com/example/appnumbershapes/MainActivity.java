package com.example.appnumbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static boolean isTriangularNumber(long num) {

        long calc_num = 8*num+1;
        long t = (long) Math.sqrt(calc_num);

        if (t*t==calc_num) {
            System.out.println(+num+ " IS triangular!");
            return true;

        } else {
            System.out.println(+num+ " IS NOT triangular!");
            return false;
        }
    }

    public static boolean isSquareNumber(long num) {

        for (int i = 0; i < num / 2 + 2; i++)
        {
            if (i * i == num)
            {
                System.out.println(+num+ " IS square!");
                return true;
            }
        }
        System.out.println(+num+ " IS NOT square!");
        return false;
    }


    public void checkNumber(View view){

        EditText enteredNumber = findViewById(R.id.enteredNumberEditText);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}