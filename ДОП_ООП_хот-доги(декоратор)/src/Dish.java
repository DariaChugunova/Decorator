public abstract class Dish {
    String description = "Неизвестный хот-дог";
    public String getDescription() {
        return description;
    }

    public abstract double cost();//необходимо реализовать в субклассах
}
