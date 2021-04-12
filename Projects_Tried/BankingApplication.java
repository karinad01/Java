package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        BankAccount object = new BankAccount("XYZ", "0125842");
        object.showMenu();

    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }


    void showMenu() {
        char option = '\0';
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome" + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("/n");
        System.out.println("Press A for CHECK BALANCE");
        System.out.println("Press B for DEPOSIT");
        System.out.println("Press C for WITHDRAW");
        System.out.println("Press D for PREVIOUS TRANSACTION");
        System.out.println("Press E for EXIT");

        do {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Enter an option:");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            option = scan.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("--------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("---------------------");
                    break;

                case 'B':
                    System.out.println("-----------------");
                    System.out.println("Enter an amount of money you want to deposit:");
                    System.out.println("-----------------");
                    int amount = scan.nextInt();
                    deposit(amount);
                    break;
                case 'C':
                    System.out.println("-----------------");
                    System.out.println("Enter an amount of money you want to withdraw: ");
                    System.out.println("------------------");
                    int amount2 = scan.nextInt();
                    withdraw(amount2);
                    break;

                case 'D':
                    System.out.println("-------------------");
                    getPreviousTransaction();
                    break;

                case 'E':
                    System.out.println("-------------------");
                    break;

                default:
                    System.out.println("You entered an invalid option. Please try again by pressing one of the options you have!");

                    break;
            }
        }
        while (option != 'E');
        System.out.println("Thank you for using the bank application");


    }


}


