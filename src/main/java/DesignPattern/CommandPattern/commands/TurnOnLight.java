package DesignPattern.CommandPattern.commands;

import DesignPattern.CommandPattern.receiver.Light;

public class TurnOnLight implements Command {
    Light light;
    public TurnOnLight(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
