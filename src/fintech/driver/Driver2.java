package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver2 {
    private static List<Account> accounts = new ArrayList<>();
    private static int transactionId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input pertama (create-account)
        String command = scanner.nextLine();
        if ("create-account".equals(command)) {
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();
            Account account = new Account(owner, accountName);
            accounts.add(account);
            System.out.println(account);
        }

        // Membaca input kedua (create-transaction)
        command = scanner.nextLine();
        if ("create-transaction".equals(command)) {
            String accountName = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            String postedAt = scanner.nextLine();
            String note = scanner.nextLine();

            Account account = findAccountByName(accountName);
            if (account != null) {
                Transaction transaction = new Transaction(accountName, amount, postedAt, note);
                account.addTransaction(transaction);
                System.out.println(transaction + "|" + account.getBalance());
            } else {
                System.out.println("Account not found");
            }
        }

        scanner.close();
    }

    private static Account findAccountByName(String accountName) {
        for (Account account : accounts) {
            if (account.getAccountName().equals(accountName)) {
                return account;
            }
        }
        return null;
    }
}