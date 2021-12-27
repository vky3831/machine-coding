package Splitwise;

import Splitwise.expense.*;
import Splitwise.model.User;
import Splitwise.split.PercentSplit;
import Splitwise.split.Split;

import java.util.List;

public class ExpenseService {
    public static Expense createExpense(ExpenseType expenseType, double amount, User paidBy, List<Split> splits, ExpenseMetadata metadata){
        switch (expenseType){
            case EXACT:
                return new ExactExpense(amount, paidBy, splits, metadata);
            case PERCENT:
                for(Split split: splits){
                    PercentSplit percentSplit = (PercentSplit) split;
                    split.setAmount((amount * percentSplit.getPercent())/100.0);
                }
                return new PercentExpense(amount, paidBy, splits, metadata);
            case EQUAL:
                int totalSplit = splits.size();
                double splitAmount = ((double) Math.round(amount*100/totalSplit))/100.0;
                for(Split split: splits){
                    split.setAmount(splitAmount);
                }
                splits.get(0).setAmount(splitAmount + (amount - splitAmount*totalSplit));
                return new EqualExpense(amount, paidBy, splits, metadata);
            default:
                return null;
        }
    }
}
