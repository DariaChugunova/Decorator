public class Espresso extends  Beverage {
    public Espresso() {
        description = "Espresso";
    }
    public double cost() {
        double cost = 0;
        if (size== Size.TALL) {
            cost =  55;
        } else if (size == Size.GRANDE) {
            cost =  68;
        } else if (size== Size.VENTI) {
            cost =  96;
        }
        return cost;
    }

}
