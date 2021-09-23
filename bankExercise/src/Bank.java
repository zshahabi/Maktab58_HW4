import model.Customer;
import model.accounts.Account;
import model.accounts.CheckingAccount;
import model.accounts.LoanAccount;
import model.accounts.SavingAccount;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customerArrayList = new ArrayList<>();

    public void addAccount(String name, Account account) {
        boolean isCustomer = isCustomer(name);
        if (isCustomer) {
            int indexOfCustomer = findIndexCustomer(name);
            customerArrayList.get(indexOfCustomer).getAccountArrayList().add(account);
        } else {
            Customer customer = new Customer(name);
            customer.getAccountArrayList().add(account);
            customerArrayList.add(customer);
        }
    }

    // ein method hame list accounthaye customer ra neshan midahad
    public void viewAccount(String nameOfCustomer) {
        if (isCustomer(nameOfCustomer)) {
            //fide index of customer
            int indexOfCustomer = findIndexCustomer(nameOfCustomer);
            //be tedad acconthaye customer mirim golo
            ArrayList<Account> accountArrayList = customerArrayList.get(indexOfCustomer).getAccountArrayList();
            for (int i = 0; i < accountArrayList.size(); i++) {
                if (accountArrayList.get(i) instanceof CheckingAccount) {
                    System.out.println("account "+ (i+1) +" :" );
                    CheckingAccount checkingAccount=(CheckingAccount) accountArrayList.get(i);
                    System.out.println(checkingAccount.toString());
                }
                if (accountArrayList.get(i) instanceof SavingAccount) {
                    System.out.println("account "+ (i+1) +" :" );
                    SavingAccount savingAccount=(SavingAccount) accountArrayList.get(i);
                    System.out.println(savingAccount.toString());
                }
                if (accountArrayList.get(i) instanceof LoanAccount) {
                    System.out.println("account "+ (i+1) +" :" );
                    LoanAccount loanAccount=(LoanAccount) accountArrayList.get(i);
                    System.out.println(loanAccount.toString());
                }
            }
        }else
            System.out.println("there is not this user");
    }

    //moshtari hesab darad?:ein method dar add account seda zade shode
    private boolean isCustomer(String name) {

        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getName().trim().equals(name.trim())) {
                return true;
            }
        }
        return false;
    }

    // index moshtari ra peyda mikonad:
    private int findIndexCustomer(String name) {
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getName().trim().equals(name.trim())) {
                return i;
            }
        }
        return -1;
    }


}
