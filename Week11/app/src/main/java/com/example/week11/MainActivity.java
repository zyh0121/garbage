package com.example.week11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private NetWorkReceiver netWorkReceiver;
    private IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.broadcasttest.MY_BROADCAST");
                sendBroadcast(intent);
            }
        });


        netWorkReceiver = new NetWorkReceiver();
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(netWorkReceiver,intentFilter);

    }
    protected  void  onDestroy(){
        super.onDestroy();
        unregisterReceiver(netWorkReceiver);
    }

    class NetWorkReceiver extends BroadcastReceiver{


        @Override
        public void onReceive(Context context, Intent intent) {
                Toast.makeText(context,"Network Changed!",Toast.LENGTH_SHORT).show();

            }

        }
    }
