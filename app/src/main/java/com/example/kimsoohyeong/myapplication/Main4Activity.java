package com.example.kimsoohyeong.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    EditText e1, e2, e3;
    CheckBox c1;
    Button b1;
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("레스토랑 메뉴 주문");

        init();
    }

    void init() {
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        b1 = (Button)findViewById(R.id.b1);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        c1 = (CheckBox)findViewById(R.id.c1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag = c1.isChecked();
                String strCnt1 = e1.getText().toString();
                String strCnt2 = e2.getText().toString();
                String strCnt3 = e3.getText().toString();
                int cnt1 = strCnt1.equals("") ? 0 : Integer.parseInt(strCnt1);
                int cnt2 = strCnt2.equals("") ? 0 : Integer.parseInt(strCnt2);
                int cnt3 = strCnt3.equals("") ? 0 : Integer.parseInt(strCnt3);
                int res = cnt1 * 15000 + cnt2 * 13000 + cnt3 * 9000;

                res -= flag ? res / 10 : 0;

                t1.setText(Integer.toString(cnt1 + cnt2 + cnt3) + "개");
                t2.setText(Integer.toString(res) + "원");
            }
        });
    }
}
