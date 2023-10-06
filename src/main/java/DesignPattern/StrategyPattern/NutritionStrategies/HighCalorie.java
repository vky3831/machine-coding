package DesignPattern.StrategyPattern.NutritionStrategies;

public class HighCalorie implements Nutrition {
    @Override
    public void eat() {
        System.out.println("High calories");
    }
}
