package Splitwise.expense;

import Splitwise.model.User;
import Splitwise.split.ExactSplit;
import Splitwise.split.Split;
import lombok.Getter;

import java.util.List;


public class ExactExpense extends Expense{


    public ExactExpense(double amount, User paidBy, List<Split> splits, ExpenseMetadata metadata) {
        super(amount, paidBy, splits, metadata);
    }

    @Override
    public boolean validate() {
        for(Split split : getSplits()){
            if(!(split instanceof ExactSplit)){
                return false;
            }
        }
        double totalAmount = getAmount();
        double sumSplitAmount = 0;
        for(Split split: getSplits()){
            sumSplitAmount += split.getAmount();
        }

        if(totalAmount != sumSplitAmount)
            return false;

        return true;
    }
}
