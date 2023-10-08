package DesignPattern.CommandPattern.invoker;

import DesignPattern.CommandPattern.commands.Command;

public class Remote {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
