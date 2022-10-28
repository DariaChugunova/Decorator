public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    public double cost() {
        double cost = beverage.cost();//получаем размер напитка, в зависимости от которого будет разная стоимость
        if (beverage.getSize() == Size.TALL) {
            cost += 30;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 35;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 40;
        }
        return cost;
    }
}
