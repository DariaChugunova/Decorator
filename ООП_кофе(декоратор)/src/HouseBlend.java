public class HouseBlend extends  Beverage{
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    public double cost() {
        double cost = 0;
        if (size == Size.TALL) {
            cost =  75;
        } else if (size== Size.GRANDE) {
            cost =  95;
        } else if (size == Size.VENTI) {
            cost =  115;
        }
        return cost;
    }
}
