package DesignPattern.DecoraterPattern;
/*
Menu:

Beverages:
Espresso - ₹ 5
Cappuccino - ₹ 10
Frappuccino - ₹ 8

Add-On
Extra Milk - ₹ 2
Whip Cream - ₹ 3
Caramel - ₹ 4

 */
public class PlayDecorater {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        ExtraMilk espresso_With_Milk = new ExtraMilk(espresso);
        WhipCream espresso_With_Milk_and_WhipCream = new WhipCream(espresso_With_Milk);

        System.out.println(espresso_With_Milk_and_WhipCream.getBeverageName());
        System.out.println(espresso_With_Milk_and_WhipCream.getPrice());

    }

}
