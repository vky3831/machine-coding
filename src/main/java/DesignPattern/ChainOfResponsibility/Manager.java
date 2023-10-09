package DesignPattern.ChainOfResponsibility;

public class Manager extends ExpenseHandler {
    public Manager(Integer limit){
        this.limit = limit;
    }
    @Override
    public void approveExoense(Integer amount) {
        System.out.println("The expense of amount " + amount + " has be approved by the Manager");
    }
}
