public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    public double cost() {
        double cost = 0;
        if (size == Size.TALL) {
            cost =  60;
        } else if (size == Size.GRANDE) {
            cost =  80;
        } else if (size== Size.VENTI) {
            cost =  100;
        }
        return cost;
    }

}
