package DesignPattern.FacadePattern;

public class LaptopOnSwitch {

    HardwareChecks hardwareChecks;
    SoftwareChecks softwareChecks;

    LaptopOnSwitch(){
        hardwareChecks = new HardwareChecks();
        softwareChecks = new SoftwareChecks();
    }

    boolean switchOnLaptop(){
        return hardwareChecks.checkHardwareOnBoot() && softwareChecks.checkSoftwareOnBoot();
    }
}
