package DesignPattern.CommandPattern;

import DesignPattern.CommandPattern.commands.*;
import DesignPattern.CommandPattern.invoker.Remote;
import DesignPattern.CommandPattern.receiver.Light;
import DesignPattern.CommandPattern.receiver.TV;

public class PlayCommand_Client {
    public static void main(String[] args) {
        TV tv = new TV();
        Light light = new Light();

        Command turnOnLight = new TurnOnLight(light);
        Command turnOffLight = new TurnOffLight(light);
        Command turnOnTV = new TurnOnTV(tv);
        Command turnOffTV = new TurnOffTV(tv);
        Remote onButton = new Remote();
        Remote offButton = new Remote();

        onButton.setCommand(turnOnLight);
        onButton.pressButton();

        onButton.setCommand(turnOnTV);
        onButton.pressButton();

        offButton.setCommand(turnOffLight);
        offButton.pressButton();

        offButton.setCommand(turnOffTV);
        offButton.pressButton();
    }
}
