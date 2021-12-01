package com.company;

public class Tank extends Soldier {
    private boolean immortal = false;


    public void reload() {

    }

    @Override
    public String toString() {
        return "Tank{" +
                "immortal=" + immortal +
                '}';
    }
}
