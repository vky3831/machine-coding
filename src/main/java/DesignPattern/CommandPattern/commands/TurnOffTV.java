package DesignPattern.CommandPattern.commands;

import DesignPattern.CommandPattern.receiver.TV;

public class TurnOffTV implements Command {
    TV tv;
    public TurnOffTV(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }
}
