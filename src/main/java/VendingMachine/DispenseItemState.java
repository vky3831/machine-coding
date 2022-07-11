package VendingMachine;

public class DispenseItemState implements State{
    VendingDevice vendingDevice = null;

    public DispenseItemState(VendingDevice vendingDevice) {
        this.vendingDevice = vendingDevice;
    }

    @Override
    public void insertCoin() throws MachineWarning {
        throw new MachineWarning("item dispense in progress");
    }

    @Override
    public void pressButton() throws MachineWarning {
        throw new MachineWarning("item dispense in progress");
    }

    @Override
    public void dispense() throws MachineWarning {

        System.out.println("Item dispensed");
        vendingDevice.setMachineState(vendingDevice.getNoCoinInsertState());
    }

    @Override
    public void cancel() throws MachineWarning {
        throw new MachineWarning("item dispense in progress");
    }
}
