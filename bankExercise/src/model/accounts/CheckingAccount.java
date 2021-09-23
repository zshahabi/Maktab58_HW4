package model.accounts;

import model.MyDate;

public class CheckingAccount extends Account {


    public CheckingAccount(MyDate openingAccountDate, long amountAccount) {
        super(openingAccountDate, amountAccount);
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountId=" + super.getAccountId() +
                ", openingAccountDate=" + super.getOpeningAccountDate() +
                ", amountAccount=" + super.getAmountAccount() +
                ", transactionArrayList=" + super.getTransactionArrayList() +
                '}';
    }
}
