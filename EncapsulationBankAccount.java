package com.gadrawingz3;

// Has only 4 fields with its setter & getter methods
// Here we have our Fully encapsulated class with private data member,
// setter & getter methods

class BankAccount {

    // Private data members
    private long accountNumber;
    private String customerName, email;
    private float amount;

    // Public getter & setter methods
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

// Class to test BankAccount class
public class EncapsulationBankAccount {
    public static void main(String[] args) {

        // Creating instance of BankAccount class
        BankAccount account = new BankAccount();

        // Setting values thru setter methods
        account.setAccountNumber(4576655500L);
        account.setCustomerName("Gad Iradufasha");
        account.setEmail("gadiradufasha@gmail.com");
        account.setAmount(9500000F);

        // Getting values thru getter methods
        System.out.println(
                account.getAccountNumber()+" | "+account.getCustomerName()+" | "
                        + account.getEmail()+" | $"+account.getAmount()
        );

    }
}
