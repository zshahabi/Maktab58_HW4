import model.MyDate;
import model.accounts.Account;
import model.accounts.CheckingAccount;
import model.accounts.LoanAccount;
import model.accounts.SavingAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Bank bank;

    public static void main(String[] args) {
        bank = new Bank();
        String message = "1. Add new account\n" +
                " 2. View accounts \n" +
                " 3. Withdraw\n" +
                " 4. Deposit\n" +
                " 5. Calculate interests\n" +
                " 6. View Transactions\n" +
                " 7. Exit";

        boolean isChoiceContinue = true;
        do {

            boolean checkExit = true;
            int choiceMenu = getNumber(message, "[1-7]*", "You enter invalid number ,enter 1-7");
            switch (choiceMenu) {
                case 1:
                    // ein method karhaye add account ra angam mide
                    addNewAccount();
                    break;
                case 2:
                    // ein method list account haye customer ra neshan midahad
                    viewAccount();
                    break;
                case 3:
                    //bardasht hesab
                    withdraw();
                    break;
                case 4:
                    //varizhesab
                    deposit();
                    break;
                case 5:
                    //mohasebe sood
                    calculateInterest();
                    break;
                case 6:
                    //didan list trakoneshha
                    viewTransactions();
                    break;

                case 7:
                    System.out.println(" exit");
                    isChoiceContinue = false;
                    checkExit = false;
                    break;

            }
            if (checkExit == true)
                isChoiceContinue = getYesOrNo("you want continue:yes or no", "you must enter yes or no");
        } while (isChoiceContinue);
    }

    private static void viewTransactions() {
    }

    private static void calculateInterest() {
    }

    private static void deposit() {
    }

    private static void withdraw() {
    }

    // method baraye namayesh list accounthaye costomer
    private static void viewAccount() {
        String nameOfCustomer = getString("enter your name", "[a-zA-Z]*", "you must enter valid name");
        bank.viewAccount(nameOfCustomer);
    }

    //method baraye meghdardehi be addaccount
    private static void addNewAccount() {
        String checkAccount = "1-CheckingAccount,2-SavingAccount,3-LoanAccount";
        int choiceNumber = getNumber(checkAccount, "[1-3]*", "You must 1-3");

        String nameCustomer = getString("enter your name", "[a-zA-Z]*", "You enter valid" +
                " name");
        int amount = getNumber("enter your amount", "[0-9]*", "you enter a valid amount");
        MyDate myDate = getDate();
        Account account = null;
        switch (choiceNumber) {
            case 1:
                account = new CheckingAccount(myDate, amount);
                break;
            case 2:
                account = new SavingAccount(myDate, amount);
                break;
            case 3:
                account = new LoanAccount(myDate, amount);
                break;
        }
        bank.addAccount(nameCustomer, account);
    }

    //methot baraye dadan tarikh
    private static MyDate getDate() {
        MyDate myDate = new MyDate();

        int year = getNumber("enter year:", "[0-9]*", "Enter 1200-1400");
        int month = getNumber("enter month:", "[0-9]*", "Enter 1-12");
        int day = getNumber("enter day:", "[0-9]*", "Enter 1-31");

        boolean checkDate = myDate.isValidDate(year, month, day);
        if (checkDate) {
            myDate = new MyDate(year, month, day);
            return myDate;
        }
        return getDate();
    }

    private static int getNumber(String message, String format, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String numberOfChoice = scanner.next();
        boolean checkNumberChoice = numberOfChoice.matches(format);
        if (!checkNumberChoice) {
            System.out.println(errorMessage);
            return getNumber(message, format, errorMessage);
        }
        return Integer.parseInt(numberOfChoice);
    }

    private static String getString(String message, String format, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String stringName = scanner.next();
        boolean checkNumberChoice = stringName.matches(format);
        if (!checkNumberChoice) {
            System.out.println(errorMessage);
            return getString(message, format, errorMessage);
        }
        return stringName;
    }

    private static boolean getYesOrNo(String message, String errorMessage) {
        System.out.println(message);
        String yesOrNo = new Scanner(System.in).next();

        if (yesOrNo.trim().toLowerCase().equals("yes")) {
            return true;
        }
        if ((yesOrNo.trim().toLowerCase(Locale.ROOT).equals("no"))) {
            return false;
        }
        System.out.println(errorMessage);
        return getYesOrNo(message, errorMessage);
    }


}
