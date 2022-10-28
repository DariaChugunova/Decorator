public abstract class Beverage {
    String description = "Неизвестный напиток";

    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.GRANDE;

    public String getDescription() {
        return description;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public  Size getSize() {
        return this.size;
    }
    public abstract double cost();//необходимо реализовать в субклассах
}
