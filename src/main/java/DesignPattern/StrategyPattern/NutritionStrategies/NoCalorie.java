package DesignPattern.StrategyPattern.NutritionStrategies;

public class NoCalorie implements Nutrition {
    @Override
    public void eat() {
        System.out.println("No calories");
    }
}
