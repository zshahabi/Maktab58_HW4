package model;

import model.accounts.Account;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Account> accountArrayList;

    public Customer(String name) {
        this.name = name;
        accountArrayList= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccountArrayList() {
        return accountArrayList;
    }

    public void setName(String name) {
        this.name = name;
    }
}
