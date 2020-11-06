package com.example.layout_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button  btn_num0;
    Button  btn_num1;
    Button  btn_num2;
    Button  btn_num3;
    Button  btn_num4;
    Button  btn_num5;
    Button  btn_num6;
    Button  btn_num7;
    Button  btn_num8;
    Button  btn_num9;
    Button  btn_back;
    Button  btn_clear;
    Button  btn_plus;
    Button  btn_div;
    Button  btn_point;
    Button  btn_equals;
    Button  btn_reduce;
    Button  btn_mut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_file);

        btn_num0=findViewById(R.id.but_num0);
        btn_num0.setOnClickListener(this);

        btn_num1=findViewById(R.id.but_num1);
        btn_num1.setOnClickListener(this);

        btn_num2=findViewById(R.id.but_num2);
        btn_num2.setOnClickListener(this);

        btn_num3=findViewById(R.id.but_num3);
        btn_num3.setOnClickListener(this);

        btn_num4=findViewById(R.id.but_num4);
        btn_num4.setOnClickListener(this);

        btn_num5=findViewById(R.id.but_num5);
        btn_num5.setOnClickListener(this);

        btn_num6=findViewById(R.id.but_num6);
        btn_num6.setOnClickListener(this);

        btn_num7=findViewById(R.id.but_num7);
        btn_num7.setOnClickListener(this);

        btn_num8=findViewById(R.id.but_num8);
        btn_num8.setOnClickListener(this);

        btn_num9=findViewById(R.id.but_num9);
        btn_num9.setOnClickListener(this);

        btn_plus=findViewById(R.id.but_plus);
        btn_plus.setOnClickListener(this);

        btn_div=findViewById(R.id.but_div);
        btn_div.setOnClickListener(this);

        btn_reduce=findViewById(R.id.but_reduce);
        btn_reduce.setOnClickListener(this);

        btn_back=findViewById(R.id.but_back);
        btn_back.setOnClickListener(this);

        btn_clear=findViewById(R.id.but_clear);
        btn_clear.setOnClickListener(this);

        btn_mut=findViewById(R.id.but_mut);
        btn_mut.setOnClickListener(this);

        btn_point=findViewById(R.id.but_point);
        btn_point.setOnClickListener(this);

        btn_equals=findViewById(R.id.but_equals);
        btn_equals.setOnClickListener(this);


    }

public  void onClick(View view){
    switch (view.getId()){
        case R.id.but_num0:
            Log.d("MainActivity","你点击了数字0");
            break;
        case R.id.but_num1:
            Log.d("MainActivity","你点击了数字");
            break;
    }
    }

}