public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }
    public double cost() {
        double cost = 0;
        if (size == Size.TALL) {
            cost =  65;
        } else if (size == Size.GRANDE) {
            cost =  82;
        } else if (size == Size.VENTI) {
            cost =  105;
        }
        return cost;
    }


}
