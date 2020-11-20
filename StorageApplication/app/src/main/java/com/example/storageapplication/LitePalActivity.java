package com.example.storageapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;

public class LitePalActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        LitePal.initialize(this);
        setContentView(R.layout.layout_litepal);

        Button btn_create = findViewById(R.id.btn_create);
        btn_create.setOnClickListener(this);

        Button btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        Button btn_delete = findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_create:
                LitePal.getDatabase();
            case R.id.btn_add:
                for (int i = 1; i <= 10; i++){
                    Book book = new Book();
                    book.setName("This is Book" + i);
                    book.setPages(100 *i);
                    book.save();
                }
            case R.id.btn_delete:
                LitePal.delete(Book.class, 1);
                LitePal.deleteAll(Book.class, "name = ?", "This is Book5");
        }
    }
}