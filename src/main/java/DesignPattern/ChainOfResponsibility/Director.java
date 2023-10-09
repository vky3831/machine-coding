package DesignPattern.ChainOfResponsibility;

public class Director extends ExpenseHandler {
    public Director(Integer limit){
        this.limit = limit;
    }
    @Override
    public void approveExoense(Integer amount) {
        System.out.println("The expense of amount " + amount + " has be approved by the Director");
    }
}
