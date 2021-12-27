package Splitwise.expense;

import Splitwise.model.User;
import Splitwise.split.PercentSplit;
import Splitwise.split.Split;

import java.util.List;

public class PercentExpense extends Expense {
    public PercentExpense(double amount, User paidBy, List<Split> splits, ExpenseMetadata metadata) {
        super(amount, paidBy, splits, metadata);
    }

    @Override
    public boolean validate() {
        for(Split split : getSplits()){
            if(!(split instanceof PercentSplit))
                return false;
        }

        double totalPercent = 100;
        double sumSplitPercent = 0;
        for(Split split : getSplits()){
            sumSplitPercent += ((PercentSplit) split).getPercent();
        }
        if(totalPercent != sumSplitPercent)
            return false;

        return true;
    }
}
