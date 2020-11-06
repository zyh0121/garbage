package com.example.week8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView01 extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recyclerview);

        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);


        recyclerView.setLayoutManager(layoutManager);
        FruitAdapterR adapterR = new FruitAdapterR(fruitList);
        recyclerView.setAdapter(adapterR);
    }

        private void initFruits(){
            Fruit apple = new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana",R.drawable.banana);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange",R.drawable.orange);
            fruitList.add(orange);
            Fruit lemon = new Fruit("Lemon",R.drawable.lemon);
            fruitList.add(lemon);
            Fruit peach = new Fruit("Peach",R.drawable.peach);
            fruitList.add(peach);
            Fruit pear = new Fruit("Pear",R.drawable.pear);
            fruitList.add(pear);
            Fruit strawbery = new Fruit("Strawberry",R.drawable.strawberry);
            fruitList.add(strawbery);
            Fruit mango = new Fruit("Mango",R.drawable.mango);
            fruitList.add(mango);


        }
}