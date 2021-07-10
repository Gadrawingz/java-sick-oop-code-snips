// Java program to demonstrate how real-world banking system works
// Where we deposit & withdraw amount from our account.
package com.gadrawingz2;

class BankAccount {

    int accountNumber;
    String customerName;
    String accountType;
    float amount;

    // Method to initialize object.
    void registerCustomer(String name, int no, String type, float amt) {
        customerName = name;
        accountNumber = no;
        amount = amt;
        accountType = type;
    }

    // Deposit method
    void depositMoney(float depAmt) {
        amount = amount + depAmt;
        System.out.println(depAmt+" deposited successfully.");
    }

    // Withdraw method
    void withdrawMoney(float wdAmount) {
        if(amount < wdAmount) {
            System.out.println("Insufficient Balance!");
        } else if(amount == wdAmount) {
            System.out.println("You can't withdraw all money from account!");
        } else {
            amount = amount - wdAmount;
            System.out.println(wdAmount+"frws withdrawn from this account.");
        }
    }


    // Method for checking bank account balance
    void checkBalance() {
        System.out.println("Current Balance is: "+amount+"rwf.\n");
    }

    // Method to display customer info+
    void displayCustomerInfo() {
        System.out.println("CUSTOMER NAME:: " + customerName);
        System.out.println("ACCOUNT NUMBER: " + accountNumber);
        System.out.println("ACCOUNT TYPE::: " + accountType);
        System.out.println("TOTAL BALANCE:: " + amount +"rwf\n");
    }
}



// Creating a class to register a customer, deposit & withdraw money
public class RealWorldBankingSystem {
    public static void main(String[] args) {

        BankAccount action = new BankAccount();

        action.registerCustomer("CYUZUZO Guillain", 3005334, "Saving", 30000);
        action.displayCustomerInfo();

        action.withdrawMoney(7000);
        action.checkBalance();


    }
}
