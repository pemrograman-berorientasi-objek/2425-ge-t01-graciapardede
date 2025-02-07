package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Account {

    private String owner;
    private String accountName;
    private double balance;

    private Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }

}