public abstract class CondimentDecorator extends  Beverage {
    Beverage beverage;//декаратор может быть обверткой для любого напитка
    public abstract String getDescription();//заново реализуем название
    public Size getSize() {
        return beverage.getSize();//возвращает объем напитка
    }
}
