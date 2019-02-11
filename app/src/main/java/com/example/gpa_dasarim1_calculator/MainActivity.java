package com.example.gpa_dasarim1_calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private Button calc;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = (EditText) findViewById(R.id.editText4);
        num2 = (EditText) findViewById(R.id.editText5);
        num3 = (EditText) findViewById(R.id.editText6);
        num4 = (EditText) findViewById(R.id.editText7);
        num5 = (EditText) findViewById(R.id.editText8);
        calc = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.textView10);


        num1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(num1.getText().length()<2){
                    num1.setError("Required");
                }

            }
        });

        num2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(num2.getText().length()<2){
                    num2.setError("Required");
                }

            }
        });

        num3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(num3.getText().length()<2){
                    num3.setError("Required");
                }

            }
        });

        num4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(num4.getText().length()<2){
                    num4.setError("Required");
                }

            }
        });

        num5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(num5.getText().length()<2){
                    num5.setError("Required");
                }

            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int number3 = Integer.parseInt(num3.getText().toString());
                int number4 = Integer.parseInt(num4.getText().toString());
                int number5 = Integer.parseInt(num5.getText().toString());
                float sum = (number1 + number2 + number3 + number4 + number5);
                float gpa = sum / 5;
                if (gpa<=60){
                    v.setBackgroundColor(0xffff0000);
                }
                else if (gpa < 80){
                    v.setBackgroundColor(0xffffff00);
                }
                else v.setBackgroundColor(0xff00ff00);
                result.setText("GPA: " + String.valueOf(gpa));

                num1.setText(null);
                num2.setText(null);
                num3.setText(null);
                num4.setText(null);
                num5.setText(null);

            }
        });



    }

}