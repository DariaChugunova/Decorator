public class salted_cucumbers extends Additives {
    public salted_cucumbers(Dish dish){
        this.dish = dish;
    }
    @Override
    public String getDescription() {
        return dish.getDescription()+" + соленые огурцы";
    }

    @Override
    public double cost() {
        double cost = dish.cost();
        return cost+20;
    }
}
