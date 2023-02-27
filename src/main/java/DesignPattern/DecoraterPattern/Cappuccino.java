package DesignPattern.DecoraterPattern;

public class Cappuccino extends Beverage {
    Cappuccino(){
        beverageName = "Cappuccino";
    }
    @Override
    int getPrice() {
        return 10;
    }
}
