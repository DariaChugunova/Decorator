public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public double cost() {
        double cost = beverage.cost();//получаем размер напитка, в зависимости от которого будет разная стоимость
        if (beverage.getSize() == Size.TALL) {
            cost += 25;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 30;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 35;
        }
        return cost;
    }
}
