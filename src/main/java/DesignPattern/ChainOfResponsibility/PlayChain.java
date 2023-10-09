package DesignPattern.ChainOfResponsibility;

public class PlayChain {
    private static ExpenseHandler getChainofExpenHandler(){
        ExpenseHandler manager = new Manager(500);
        ExpenseHandler director = new Director(1000);
        ExpenseHandler ceo = new CEO(1500);
        manager.setNextExpenseHandler(director);
        director.setNextExpenseHandler(ceo);

        return manager;

    }
    public static void main(String[] args) {
        ExpenseHandler expenseHandler = getChainofExpenHandler();
        System.out.println("Processing expense of 455 bucks");
        expenseHandler.processExpense(455);
        System.out.println("Processing expense of 700 bucks");
        expenseHandler.processExpense(700);
        System.out.println("Processing expense of 1100 bucks");
        expenseHandler.processExpense(1100);
        System.out.println("Processing expense of 2000 bucks");
        expenseHandler.processExpense(2000);

    }
}
