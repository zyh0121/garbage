package com.example.week11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StaticReceiverActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_receiver);

        Button btn_normal = findViewById(R.id.btn_normal);
        btn_normal.setOnClickListener(this);

        Button btn_order = findViewById(R.id.btn_order);
        btn_order.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_normal:
                Intent intent_normal = new Intent("com.example.broadcasttest.MY_BROADCAST");
                intent_normal.setPackage(getPackageName());
                sendBroadcast(intent_normal);
                break;
            case R.id.btn_order :
                Intent intent_order= new Intent("com.example.broadcasttest.MY_BROADCAST");
                    intent_order.setPackage(getPackageName());
                    sendBroadcast(intent_order,null);
                    break;
            default:
                break;
        }


    }
}