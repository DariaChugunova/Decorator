package com.company1;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 100;
    }
}
