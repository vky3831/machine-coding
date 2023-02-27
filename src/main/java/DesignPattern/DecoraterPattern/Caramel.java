package DesignPattern.DecoraterPattern;

public class Caramel extends AddOn {
    Beverage beverage;
    String addOn = " + Caramel";
    int addOnPrice = 4;
    Caramel(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + addOn;
    }

    @Override
    int getPrice() {
        return beverage.getPrice() + addOnPrice;
    }
}
