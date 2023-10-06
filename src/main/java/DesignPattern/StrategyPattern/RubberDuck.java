package DesignPattern.StrategyPattern;

import DesignPattern.StrategyPattern.FlightStrategies.Flight;
import DesignPattern.StrategyPattern.FlightStrategies.NoFly;
import DesignPattern.StrategyPattern.NutritionStrategies.NoCalorie;
import DesignPattern.StrategyPattern.NutritionStrategies.Nutrition;
import DesignPattern.StrategyPattern.SoundStrategies.NoQuack;
import DesignPattern.StrategyPattern.SoundStrategies.Sound;

public class RubberDuck extends Duck {
    RubberDuck() {
        super(new NoFly(), new NoCalorie(), new NoQuack());
    }
}
