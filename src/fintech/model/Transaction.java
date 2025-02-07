package fintech.model;

import java.time.LocalDateTime;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Transaction {

    private String id;
    private String accountName;
    private double amount;
    private LocalDateTime postedAt;
    private String type;
    private String note;
    private double balanceAfterTransaction;

    public Transaction(String accountName, double amount, LocalDateTime postedAt, String note, double balanceAfterTransaction) {
        this.id = ++idCounter;
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = note;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    public int getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getPostedAt() {
        return postedAt;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return id + "|" + accountName + "|" + amount + "|" + postedAt + "|" + type + "|" + note + "|" + balanceAfterTransaction;
    }


}