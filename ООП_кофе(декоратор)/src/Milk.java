public class Milk extends  CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    public double cost() {
        double cost = beverage.cost();//получаем размер напитка, в зависимости от которого будет разная стоимость
        if (beverage.getSize() == Size.TALL) {
            cost += 10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 20;
        }
        return cost;
    }
}
