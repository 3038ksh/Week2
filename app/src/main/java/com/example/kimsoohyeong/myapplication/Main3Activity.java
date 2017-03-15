package com.example.kimsoohyeong.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("온도변환기");

        init();
    }

    void init() {
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = e1.getText().toString();
                if (temp.equals("")) {
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(),
                            "값을 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                } else {
                    double res1 = Double.parseDouble(temp) * 1.8 + 32;

                    Toast.makeText(getApplicationContext(),
                            "화씨 온도는 " + res1 + "도 입니다",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = e2.getText().toString();
                if (temp.equals("")) {
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(),
                            "값을 입력해주세요",
                            Toast.LENGTH_SHORT).show();
                } else {
                    double res2 = (Double.parseDouble(temp) - 32) / 1.8;

                    Toast.makeText(getApplicationContext(),
                            "섭씨 온도는 " + res2 + "도 입니다",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
