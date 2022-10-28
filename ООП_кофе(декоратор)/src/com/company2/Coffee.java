package com.company2;

public class Coffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.cost());
        beverage.milk = true;
        System.out.println(beverage.cost());
    }
}
