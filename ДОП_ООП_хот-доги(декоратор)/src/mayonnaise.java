public class mayonnaise extends Additives{
    public mayonnaise(Dish dish){
        this.dish = dish;
    }
    @Override
    public String getDescription() {
        return dish.getDescription()+" + майонез";
    }

    @Override
    public double cost() {
        double cost = dish.cost();
        return cost+10;
    }
}
