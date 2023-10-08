package DesignPattern.CommandPattern.commands;

import DesignPattern.CommandPattern.receiver.Light;

public class TurnOffLight implements Command {
    Light light;
    public TurnOffLight(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
