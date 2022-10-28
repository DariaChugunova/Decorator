public class mustard extends Additives{
    public mustard(Dish dish){
        this.dish = dish;
    }
    @Override
    public String getDescription() {
        return dish.getDescription()+" + горчица";
    }

    @Override
    public double cost() {
        double cost = dish.cost();
        return cost+10;
    }
}
