package com.company1;

public class Coffee {
    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        System.out.println( beverage.getDescription());
        System.out.println(beverage.cost());
        System.out.println();

        Beverage beverage1 = new Espresso();
        System.out.println( beverage1.getDescription());
        System.out.println(beverage1.cost());
        System.out.println();

        Beverage beverage2 = new Espressoandmilk();
        System.out.println( beverage2.getDescription());
        System.out.println(beverage2.cost());
        System.out.println();
    }
}
