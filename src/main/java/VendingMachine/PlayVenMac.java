package VendingMachine;

public class PlayVenMac {
    public static void main(String[] args) {
        test_successItemDispensed();
        test_cancelTransaction();
        test_invalidPressButton();
        test_invalidCancel();
        test_invalidInsertCoin();
    }

    private static void test_invalidInsertCoin() {
        System.out.println("** test_invalidInsertCoin **");
        VendingDevice vendingDevice = new VendingDevice();
        try{
            vendingDevice.insertCoin();
            vendingDevice.insertCoin();
        }catch (MachineWarning e){
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------------------------");
    }

    private static void test_invalidCancel() {
        System.out.println("** test_invalidCancel **");
        VendingDevice vendingDevice = new VendingDevice();
        try{
            vendingDevice.cancel();
        }catch (MachineWarning e){
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------------------------");
    }

    private static void test_invalidPressButton() {
        System.out.println("** test_invalidPressButton **");
        VendingDevice vendingDevice = new VendingDevice();
        try{
            vendingDevice.pressButton();
        }catch (MachineWarning e){
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------------------------");
    }

    private static void test_cancelTransaction() {
        System.out.println("** test_cancelTransaction **");
        VendingDevice vendingDevice = new VendingDevice();
        vendingDevice.insertCoin();
        vendingDevice.cancel();
        System.out.println("-------------------------------------");
    }

    private static void test_successItemDispensed() {
        System.out.println("** test_successItemDispensed **");
        VendingDevice vendingDevice = new VendingDevice();
        vendingDevice.insertCoin();
        vendingDevice.pressButton();
        System.out.println("-------------------------------------");
    }
}
