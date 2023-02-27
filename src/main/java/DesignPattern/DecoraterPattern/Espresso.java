package DesignPattern.DecoraterPattern;

public class Espresso extends Beverage {
    Espresso(){
        beverageName = "Espresso";
    }
    @Override
    int getPrice() {
        return 5;
    }
}
