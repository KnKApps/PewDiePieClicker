package com.knk.pewdiepieclicker;

import android.view.View;

public abstract class PowerUp {
    private int count;

    private long basePrice;
    private long price;
    private float modifier;

    private int max;
    private String name;
    private View view;


    public PowerUp(float modifier, long price, View view, String name, int max) {
        this.count = 0;
        this.modifier = modifier;
        this.price = price;
        this.basePrice = price;
        this.max = max;
        this.view = view;
        this.name = name;
    }
    public void increment(){
        this.count++;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setModifier(float modifier) {

        this.modifier = modifier;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setView(View view) {
        this.view = view;
    }

    public int getCount() {
        return count;
    }

    public long getPrice() {
        return price;
    }

    public float getModifier() {
        return modifier;
    }

    public int getMax() {
        return max;
    }

    public String getName() {
        return name;
    }

    public View getView() {
        return view;
    }

    public long getBasePrice() {return basePrice;}

}
