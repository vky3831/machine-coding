package DesignPattern.StrategyPattern.SoundStrategies;

public class HighPitch implements Sound {
    @Override
    public void quack() {
        System.out.println("High pitch");
    }
}
