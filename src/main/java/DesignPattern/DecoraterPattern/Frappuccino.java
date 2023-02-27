package DesignPattern.DecoraterPattern;

public class Frappuccino extends Beverage {
    Frappuccino(){
        beverageName = "Frappuccino";
    }
    @Override
    int getPrice() {
        return 8;
    }
}
