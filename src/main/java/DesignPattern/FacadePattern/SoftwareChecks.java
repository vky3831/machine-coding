package DesignPattern.FacadePattern;

public class SoftwareChecks {
    OperatingSystem os;
    Drivers drivers;

    SoftwareChecks(){
        os = new OperatingSystem();
        drivers = new Drivers();
    }

    boolean checkSoftwareOnBoot(){
        os.checkOperatingSystemOnBoot();
        drivers.checkDriversOnBoot();
        return true;
    }
}
