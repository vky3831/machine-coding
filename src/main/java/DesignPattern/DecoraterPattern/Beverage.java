package DesignPattern.DecoraterPattern;

public abstract class Beverage {
    String beverageName;
    String getBeverageName(){
        return beverageName;
    }
    abstract int getPrice();
}
