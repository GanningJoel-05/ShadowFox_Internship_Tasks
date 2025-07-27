package BankApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========== WELCOME TO THE BANK ACCOUNT MANAGEMENT SYSTEM ==========");

        System.out.print("Enter the Account Holder Name: \n");
        String holderName = scanner.nextLine();
        System.out.print("Enter the account number: \n");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter the Bank Name: \n");
        String bankName = scanner.nextLine();
        System.out.print("Enter the initial balance (or 0): \n");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(holderName, accountNumber, bankName,initialBalance);

        while (true) {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Show Account Info");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: \n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n========== DEPOSIT AMOUNT ==========");
                    System.out.print("Enter the amount to be deposited: \n");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("\n========== WITHDRAWING AMOUNT ==========");
                    System.out.print("Enter the amount to be withdrawn: \n");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("\n========== BALANCE AMOUNT ==========");
                    System.out.println("Your Current Account Balance: ₹" + account.getBalance());
                    break;
                case 4:
                    System.out.println("\n========== YOUR TRANSACTION HISTORY ==========");
                    System.out.println("Transaction History:");
                    for (Transaction transaction : account.getTransactionHistory()) {
                        System.out.println(transaction);
                    }
                    break;
                case 5:
                    System.out.println("\n========== YOUR ACCOUNT INFO ==========");
                    System.out.println("Account Name: " + account.getAccountHolder());
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Banking Name: " + account.getBankname());
                    break;
                case 6:
                    System.out.println("\nExiting...... 👋");
                    System.out.println("THANKS A LOT FOR USING MY CONSOLE BASED BANK ACCOUNT MANAGEMENT SYSTEM ❤️");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice ❌. Please try again.");
            }
        }
    }
}
