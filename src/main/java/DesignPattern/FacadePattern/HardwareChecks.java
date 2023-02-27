package DesignPattern.FacadePattern;

public class HardwareChecks {
    MotherBoard motherBoard;
    RAM ram;

    HardwareChecks(){
        motherBoard = new MotherBoard();
        ram = new RAM();
    }

    boolean checkHardwareOnBoot(){
        motherBoard.checkMotherBoardOnBoot();
        ram.checkRAMOnBoot();
        return true;
    }
}
