package BankApp;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String accountHolder;
    private final String accountNumber;
    private final String bankName;
    private double balance;
    private final List<Transaction> transactionHistory;

    public BankAccount(String accountHolder, String accountNumber, String bankName,double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.println("₹" + amount + " was deposited successfully! ✅");
        }
        else {
            System.out.println("Invalid deposit amount! ❌");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", amount));
            System.out.println("₹" + amount + " was withdrawn successfully! ✅");
        }
        else {
            System.out.println("Invalid withdrawal or insufficient funds! ❌");
        }
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankname() {
        return bankName;
    }
}
