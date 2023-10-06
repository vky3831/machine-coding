package DesignPattern.StrategyPattern;

import DesignPattern.StrategyPattern.FlightStrategies.Flight;
import DesignPattern.StrategyPattern.FlightStrategies.LowFly;
import DesignPattern.StrategyPattern.NutritionStrategies.LowCalorie;
import DesignPattern.StrategyPattern.NutritionStrategies.Nutrition;
import DesignPattern.StrategyPattern.SoundStrategies.Sound;

public abstract class Duck {
    Flight flight;
    Nutrition nutrition;
    Sound sound;

    Duck(Flight flight, Nutrition nutrition, Sound sound){
        this.flight = flight;
        this.nutrition = nutrition;
        this.sound = sound;
    }

    public void fly(){
        flight.fly();
    }

    public void quack(){
        sound.quack();
    }

    public void eat(){
        nutrition.eat();
    }

}
