package model.accounts;

import model.MyDate;

public class LoanAccount extends Account{
    public LoanAccount(MyDate openingAccountDate, long amountAccount) {
        super(openingAccountDate, amountAccount);
    }

    @Override
    public String toString() {
        return "LoanAccount{" +
                "accountId=" + super.getAccountId() +
                ", openingAccountDate=" + super.getOpeningAccountDate() +
                ", amountAccount=" + super.getAmountAccount() +
                ", transactionArrayList=" + super.getTransactionArrayList() +
                '}';
    }
}
