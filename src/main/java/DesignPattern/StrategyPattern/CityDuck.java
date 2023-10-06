package DesignPattern.StrategyPattern;

import DesignPattern.StrategyPattern.FlightStrategies.LowFly;
import DesignPattern.StrategyPattern.NutritionStrategies.LowCalorie;
import DesignPattern.StrategyPattern.SoundStrategies.LowPitch;

public class CityDuck extends Duck {
    CityDuck(){
        super(new LowFly(), new LowCalorie(), new LowPitch());
    }
}
