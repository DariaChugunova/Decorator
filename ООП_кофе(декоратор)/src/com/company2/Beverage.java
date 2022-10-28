package com.company2;

public abstract class Beverage {
    String description = "Неизвестный напиток";
    boolean milk = false;
    boolean soy = false;
    boolean mocha = false;
    boolean whip = false;

    public String getDescription() {
        return description;
    }

    public double cost() {
        int r = 0;
        if (isMilk()) {
            r += 15;
        }
        if (isMocha()) {
            r += 20;
        }
        if (isSoy()) {
            r += 10;
        }
        if (isWhip()) {
            r += 25;
        }

        return r;
    }


    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
