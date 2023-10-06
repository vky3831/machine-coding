package DesignPattern.StrategyPattern.SoundStrategies;

public class NoQuack implements Sound {
    @Override
    public void quack() {
        System.out.println("No quack");
    }
}
