package DesignPattern.StrategyPattern;

import DesignPattern.StrategyPattern.FlightStrategies.Flight;
import DesignPattern.StrategyPattern.FlightStrategies.HighFly;
import DesignPattern.StrategyPattern.NutritionStrategies.HighCalorie;
import DesignPattern.StrategyPattern.NutritionStrategies.Nutrition;
import DesignPattern.StrategyPattern.SoundStrategies.HighPitch;
import DesignPattern.StrategyPattern.SoundStrategies.Sound;

public class ForestDuck extends Duck {
    ForestDuck() {
        super(new HighFly(), new HighCalorie(), new HighPitch());
    }
}
