
public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
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
