package account;

import java.util.Date;
import java.util.ArrayList;
import java.rmi.server.UID;


public class account {
    static String owner;
    static UID accountNumber;
    static float balance;
    static Date accountDate;

    public static class operation{
        String operation;
        int Amount;
        Date date;

        public operation(String name, int amount) {
            operation = name;
            Amount = amount;
            date = new Date();
        }
    }
    static ArrayList<operation> history;

    public account(String name, float amount){
        owner = name;
        accountNumber = new UID();
        balance = amount;
        accountDate = new Date();
        history =new ArrayList<>();

    }


    public void deposit(int amount){
        account.balance += amount;
        operation deposit = new operation("deposit", amount);
        account.history.add(deposit);
    }
    public void  withdrawal(int amount){
        account.balance -= amount;
        operation withdrawal = new operation("withdrawal", amount);
        account.history.add(withdrawal);
    }
    public void printHistory(){
        System.out.println("Your operations was :");
        for(operation op : history ) {
            System.out.println(op.operation);
            System.out.println(op.Amount);
            System.out.println(op.date);
        }
    }
    public void printAccount(){
        System.out.println("Account Number =" + accountNumber);
        System.out.println("owner Account =" + owner);
        System.out.println("date creation of the account =" + accountDate);
        System.out.println("balance =" + balance);
    }


}
