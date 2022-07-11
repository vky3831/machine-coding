package VendingMachine;

public class VendingDevice {

    NoCoinInsertState noCoinInsertState = new NoCoinInsertState(this);
    CoinInsertedState coinInsertedState = new CoinInsertedState(this);
    DispenseCashState dispenseCashState = new DispenseCashState(this);
    DispenseItemState dispenseItemState = new DispenseItemState(this);
    State machineState = null;

    public VendingDevice() {
        this.machineState = noCoinInsertState;
    }

    public State getMachineState() {
        return machineState;
    }

    public void setMachineState(State machineState) {
        this.machineState = machineState;
    }

    public NoCoinInsertState getNoCoinInsertState() {
        return noCoinInsertState;
    }

    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public DispenseCashState getDispenseCashState() {
        return dispenseCashState;
    }

    public DispenseItemState getDispenseItemState() {
        return dispenseItemState;
    }

    public void insertCoin(){
        machineState.insertCoin();
    }

    public void cancel(){
        machineState.cancel();
    }

    public void pressButton(){
        machineState.pressButton();
        machineState.dispense(); // dispense cash
        machineState.dispense(); // dispense item
    }
}
