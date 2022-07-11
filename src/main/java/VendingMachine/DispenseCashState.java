package VendingMachine;

public class DispenseCashState implements State{
    VendingDevice vendingDevice;

    public DispenseCashState(VendingDevice vendingDevice) {
        this.vendingDevice = vendingDevice;
    }

    @Override
    public void insertCoin() throws MachineWarning {

        throw new MachineWarning("cash dispense in progress");
    }

    @Override
    public void pressButton() throws MachineWarning {

        throw new MachineWarning("cash dispense in progress");
    }

    @Override
    public void dispense() throws MachineWarning {

        System.out.println("Change issued");
        vendingDevice.setMachineState(vendingDevice.getDispenseItemState());
    }

    @Override
    public void cancel() throws MachineWarning {

        throw new MachineWarning("cash dispense in progress");
    }
}
