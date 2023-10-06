package DesignPattern.StrategyPattern.NutritionStrategies;

public class LowCalorie implements Nutrition {
    @Override
    public void eat() {
        System.out.println("Low calories");
    }
}
