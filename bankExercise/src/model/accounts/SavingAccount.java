package model.accounts;

import model.MyDate;

public class SavingAccount extends Account{
    public SavingAccount(MyDate openingAccountDate, long amountAccount) {
        super(openingAccountDate, amountAccount);
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "accountId=" + super.getAccountId() +
                ", openingAccountDate=" + super.getOpeningAccountDate() +
                ", amountAccount=" + super.getAmountAccount() +
                ", transactionArrayList=" + super.getTransactionArrayList() +
                '}';
    }
}
