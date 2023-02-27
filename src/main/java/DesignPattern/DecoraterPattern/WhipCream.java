package DesignPattern.DecoraterPattern;

public class WhipCream extends AddOn {
    Beverage beverage;
    String addOn = " + Whip Cream";
    int addOnPrice = 3;
    WhipCream(Beverage beverage){
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
