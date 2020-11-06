package com.example.week5app;

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String fruitName, int fruitImage){
        this.name = fruitName;
        this.imageId = fruitImage;
    }

    public String getName(){
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
