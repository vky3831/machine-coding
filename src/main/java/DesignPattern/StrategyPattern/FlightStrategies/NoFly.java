package DesignPattern.StrategyPattern.FlightStrategies;

public class NoFly implements Flight {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
