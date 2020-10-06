package com.edisiswanto.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputOne, inputTwo;
    Button btnPlus, btnMin, btnKali, btnDevide, btnClear;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputOne = findViewById(R.id.inputOne);
        inputTwo = findViewById(R.id.inputTwo);
        btnPlus = findViewById(R.id.btnPlus);
        btnMin = findViewById(R.id.btnMin);
        btnKali = findViewById(R.id.btnKali);
        btnDevide = findViewById(R.id.btnDevide);
        btnClear = findViewById(R.id.btnClear);
        textResult = findViewById(R.id.textResult);


        // penjumlahan
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputOne.getText().length() > 0 && inputTwo.getText().length() > 0) {
                    double numberOne = Double.parseDouble(inputOne.getText().toString());
                    double numberTwo = Double.parseDouble(inputTwo.getText().toString());
                    double result = numberOne + numberTwo;

                    textResult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Pertama dan kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        // pengurangan
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputOne.getText().length() > 0 && inputTwo.getText().length() > 0) {
                    double numberOne = Double.parseDouble(inputOne.getText().toString());
                    double numberTwo = Double.parseDouble(inputTwo.getText().toString());
                    double result = numberOne - numberTwo;

                    textResult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Pertama dan kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        // kali
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputOne.getText().length() > 0 && inputTwo.getText().length() > 0) {
                    double numberOne = Double.parseDouble(inputOne.getText().toString());
                    double numberTwo = Double.parseDouble(inputTwo.getText().toString());
                    double result = numberOne * numberTwo;

                    textResult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Pertama dan kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        //btnDevide
        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputOne.getText().length() > 0 && inputTwo.getText().length() > 0) {
                    double numberOne = Double.parseDouble(inputOne.getText().toString());
                    double numberTwo = Double.parseDouble(inputTwo.getText().toString());
                    double result = numberOne / numberTwo;

                    textResult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka Pertama dan kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        //btnClear
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputOne.setText("");
                inputTwo.setText("");
                textResult.setText("0");
                inputOne.requestFocus();

            }
        });
    }
}