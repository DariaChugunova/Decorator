public class StarbuzzCoffee {
    public static void main(String args[]) {

        Beverage beverage = new Espresso();//заказываем экспрессо
        beverage.setSize(Beverage.Size.GRANDE);//{ TALL, GRANDE, VENTI }
        System.out.println(beverage.getDescription()+" "+beverage.getSize()
                + " "+ beverage.cost());//вывод названия и стоймости
        beverage.setSize(Beverage.Size.VENTI);//{ TALL, GRANDE, VENTI }
        System.out.println(beverage.getDescription()+" "+beverage.getSize()
                + " "+ beverage.cost());//вывод названия и стоймости


        Beverage beverage2 = new DarkRoast();//заказываем кофе с темной обжаркой
        beverage2.setSize(Beverage.Size.GRANDE);
        beverage2 = new Whip(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" "+beverage2.getSize()
                  + " "+beverage2.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.TALL);
        beverage3 = new Whip(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription() +" "+beverage3.getSize()
                + " "+ beverage3.cost());

        Beverage beverage4 = new Decaf();
        beverage4.setSize(Beverage.Size.TALL);
        beverage4 = new Soy(beverage4);
        System.out.println(beverage4.getDescription()+" "+beverage4.getSize()
                + " "+beverage4.cost());

        Beverage beverage5 = new Decaf();//заказываем экспрессо
        beverage5.setSize(Beverage.Size.VENTI);
        beverage5 = new Soy(beverage5);
        System.out.println(beverage5.getDescription()+" "+beverage4.getSize()
                + " "+beverage5.cost());


    }
}
