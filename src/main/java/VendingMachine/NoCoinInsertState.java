package VendingMachine;

public class NoCoinInsertState implements State{
    VendingDevice vendingDevice = null;

    public NoCoinInsertState(VendingDevice vendingDevice) {
        this.vendingDevice = vendingDevice;
    }

    @Override
    public void insertCoin() throws MachineWarning {

        System.out.println("Coin inserted");
        vendingDevice.setMachineState(vendingDevice.getCoinInsertedState());
    }

    @Override
    public void pressButton() throws MachineWarning {
        throw new MachineWarning("Insert coin first");
    }

    @Override
    public void dispense() throws MachineWarning {
        throw new MachineWarning("Insert coin first");
    }

    @Override
    public void cancel() throws MachineWarning {
        throw new MachineWarning("Insert coin first");
    }
}
