package com.example.anim_intnetn_grid;

public class Food {
    private String nameFood;
    private String priceFood;
    private int picture;

    public Food(String nameFood, String priceFood, int picture) {
        this.nameFood = nameFood;
        this.priceFood = priceFood;
        this.picture = picture;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(String priceFood) {
        this.priceFood = priceFood;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
