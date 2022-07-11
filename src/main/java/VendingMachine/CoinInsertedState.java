package VendingMachine;

public class CoinInsertedState implements State{

    VendingDevice vendingDevice = null;

    public CoinInsertedState(VendingDevice vendingDevice) {
        this.vendingDevice = vendingDevice;
    }

    @Override
    public void insertCoin() throws MachineWarning {

        throw new MachineWarning("Coin already inserted. Please select item by pressing button");
    }

    @Override
    public void pressButton() throws MachineWarning {

        System.out.println("Initiating item dispense.");
        vendingDevice.setMachineState(vendingDevice.getDispenseCashState());
    }

    @Override
    public void dispense() throws MachineWarning {

        throw new MachineWarning("Coin already inserted. Please select item by pressing button");
    }

    @Override
    public void cancel() throws MachineWarning {

        System.out.println("Refund issued.");
        vendingDevice.setMachineState(vendingDevice.getNoCoinInsertState());
    }
}
