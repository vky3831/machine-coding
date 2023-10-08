package DesignPattern.CommandPattern.commands;

import DesignPattern.CommandPattern.receiver.TV;

public class TurnOnTV implements Command {
    TV tv;
    public TurnOnTV(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }
}
