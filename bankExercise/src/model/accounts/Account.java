package model.accounts;

import model.MyDate;
import model.Transaction;

import java.util.ArrayList;
import java.util.Random;

public class Account {
    private long accountId;
    private MyDate openingAccountDate;
    private long amountAccount;
    private ArrayList<Transaction> transactionArrayList;//list of trakonesh

    protected Account(MyDate openingAccountDate, long amountAccount) {
        this.openingAccountDate = openingAccountDate;
        this.amountAccount = amountAccount;
        transactionArrayList = new ArrayList<>();
        generateAccountId();
    }

    private void generateAccountId() {
        Random random = new Random();
        //todo
        accountId = random.nextInt(999999 - 100000) + 100000;
    }

    public ArrayList<Transaction> getTransactionArrayList() {
        return transactionArrayList;
    }

    public long getAccountId() {
        return accountId;
    }

    public MyDate getOpeningAccountDate() {
        return openingAccountDate;
    }

    public void setOpeningAccountDate(MyDate openingAccountDate) {
        this.openingAccountDate = openingAccountDate;
    }

    public long getAmountAccount() {
        return amountAccount;
    }

    public void setAmountAccount(long amountAccount) {
        this.amountAccount = amountAccount;
    }


}
