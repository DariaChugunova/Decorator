public class ketchup extends Additives{
    public ketchup(Dish dish){
        this.dish = dish;
    }
    @Override
    public String getDescription() {
        return dish.getDescription()+" + кетчуп";
    }

    @Override
    public double cost() {
        double cost = dish.cost();
        return cost+10;
    }
}
