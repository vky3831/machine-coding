package DesignPattern.DecoraterPattern;

public class ExtraMilk extends AddOn {
    Beverage beverage;
    String addOn = " + Extra Milk";
    int addOnPrice = 2;
    ExtraMilk(Beverage beverage){
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
