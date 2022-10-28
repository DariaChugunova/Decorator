package com.company1;

public abstract class Beverage {
    String description = "Неизвестный напиток";

    public String getDescription() {
        return description;
    }

    public abstract double cost();//необходимо реализовать в субклассах
}
