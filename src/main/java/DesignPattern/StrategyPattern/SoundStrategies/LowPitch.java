package DesignPattern.StrategyPattern.SoundStrategies;

public class LowPitch implements Sound {
    @Override
    public void quack() {
        System.out.println("Low pitch");
    }
}
