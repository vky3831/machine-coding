package DesignPattern.StrategyPattern.FlightStrategies;

public class HighFly implements Flight {
    @Override
    public void fly() {
        System.out.println("High fly");
    }
}
