package DesignPattern.StrategyPattern.FlightStrategies;

public class LowFly implements Flight {
    @Override
    public void fly() {
        System.out.println("Low fly");
    }
}
