package com.example.week5app;

import android.app.AlertDialog;
import android.app.AppComponentFactory;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity  extends AppCompatActivity implements View.OnClickListener {

    Button btn_register;
    Button btn_login;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        btn_register =findViewById(R.id.btn_register);
        btn_login =findViewById(R.id.btn_login);

        btn_register.setOnClickListener(this);
        btn_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_register:
                Toast.makeText(LoginActivity.this, "注册成功！" , Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_login:
                AlertDialog.Builder alerBuilder = new AlertDialog.Builder( LoginActivity.this);
                alerBuilder.setIcon(R.mipmap.ic_launcher);
                alerBuilder.setTitle("用户登录确认弹窗");

                alerBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Toast.makeText(LoginActivity.this, "登录成功！",Toast.LENGTH_LONG).show();

                    }
                });
                alerBuilder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Toast.makeText(LoginActivity.this, "登录失败！",Toast.LENGTH_LONG).show();

                    }
                });
                AlertDialog myAliert = alerBuilder.create();
                myAliert.show();
                break;
            default:
                break;
        }

    }
}