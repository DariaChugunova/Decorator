public class stall {
    public static void main(String[] args) {
        Dish dish = new Classic_hot_dog();
        System.out.println(dish.getDescription() + " " + dish.cost());
        System.out.println();

        Dish dish1 = new Chicken_hot_dog();
        dish1 = new ketchup(dish1);
        dish1 = new ketchup(dish1);
        dish1 = new mayonnaise(dish1);
        System.out.println(dish1.getDescription() + " " + dish1.cost());
        System.out.println();

        Dish dish2 = new hunting_hot_dog();
        dish2 = new ketchup(dish2);
        dish2 = new mustard(dish2);
        dish2 = new salted_cucumbers(dish2);
        System.out.println(dish2.getDescription() + " " + dish2.cost());
        System.out.println();
    }
}
