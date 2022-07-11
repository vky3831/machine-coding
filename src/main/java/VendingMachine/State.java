package VendingMachine;

public interface State {
    void insertCoin() throws MachineWarning;
    void pressButton() throws MachineWarning;
    void dispense() throws MachineWarning;
    void cancel() throws MachineWarning;
}
