package DesignPattern.StrategyPattern;

public class PlayStrategy {
    public static void main(String[] args) {
        Duck forestDuck = new ForestDuck();
        Duck cityDuck = new CityDuck();
        Duck rubberDuck = new RubberDuck();

        System.out.println("Forest Duck Behaviour");
        forestDuck.fly();
        forestDuck.eat();
        forestDuck.quack();

        System.out.println("City Duck Behaviour");
        cityDuck.fly();
        cityDuck.eat();
        cityDuck.quack();

        System.out.println("Rubber Duck Behaviour");
        rubberDuck.fly();
        rubberDuck.eat();
        rubberDuck.quack();
    }
}
