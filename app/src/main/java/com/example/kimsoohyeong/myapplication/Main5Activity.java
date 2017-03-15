package com.example.kimsoohyeong.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("계산기");

        init();
    }

    void init() {
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();

                if (num1.equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                } else {
                    if (num2.equals("")) {
                        Toast.makeText(getApplicationContext(),
                                "값을 입력하세요",
                                Toast.LENGTH_SHORT).show();
                        e2.requestFocus();
                    } else {
                        int res = Integer.parseInt(num1) + Integer.parseInt(num2);
                        Toast.makeText(getApplicationContext(),
                                "더하기 계산 결과는 " + res + "입니다.",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();

                if (num1.equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                } else {
                    if (num2.equals("")) {
                        Toast.makeText(getApplicationContext(),
                                "값을 입력하세요",
                                Toast.LENGTH_SHORT).show();
                        e2.requestFocus();
                    } else {
                        int res = Integer.parseInt(num1) - Integer.parseInt(num2);
                        Toast.makeText(getApplicationContext(),
                                "빼기 계산 결과는 " + res + "입니다.",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();

                if (num1.equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                } else {
                    if (num2.equals("")) {
                        Toast.makeText(getApplicationContext(),
                                "값을 입력하세요",
                                Toast.LENGTH_SHORT).show();
                        e2.requestFocus();
                    } else {
                        int res = Integer.parseInt(num1) * Integer.parseInt(num2);
                        Toast.makeText(getApplicationContext(),
                                "곱하기 계산 결과는 " + res + "입니다.",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();

                if (num1.equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                } else {
                    if (num2.equals("")) {
                        Toast.makeText(getApplicationContext(),
                                "값을 입력하세요",
                                Toast.LENGTH_SHORT).show();
                        e2.requestFocus();
                    } else {
                        float res = Float.parseFloat(num1) / Float.parseFloat(num2);
                        Toast.makeText(getApplicationContext(),
                                "나누기 계산 결과는 " + res + "입니다.",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
