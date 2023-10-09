package DesignPattern.ChainOfResponsibility;

import java.util.Objects;

public abstract class ExpenseHandler {
    private ExpenseHandler nextExpenseHandler;
    Integer limit;

    public void setNextExpenseHandler(ExpenseHandler nextExpenseHandler) {
        this.nextExpenseHandler = nextExpenseHandler;
    }

    public void processExpense(Integer amount){
        if(amount <= limit){
            approveExoense(amount);
        }else{
            if(Objects.nonNull(nextExpenseHandler)){
                nextExpenseHandler.processExpense(amount);
            }else{
                System.out.println("This expense is beyond the allocated budget");
            }
        }
    }
    public abstract void approveExoense(Integer amount);
}
