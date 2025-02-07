package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @autors 12S23002 Fernando Silitonga
 * @autors 12S23044 Gracia Pardede
 */

public class Driver2 {
    private static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();

            if (command.equals("create-account")) {
                String owner = scanner.nextLine();
                String accountName = scanner.nextLine();
                Account account = new Account(owner, accountName);
                accounts.put(accountName, account);
                System.out.println(account);
            } else if (command.equals("create-transaction")) {
                String accountName = scanner.nextLine();
                double amount = Double.parseDouble(scanner.nextLine());
                String postedAtStr = scanner.nextLine();
                String note = scanner.nextLine();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime postedAt = LocalDateTime.parse(postedAtStr, formatter);

                Account account = accounts.get(accountName);
                if (account != null) {
                    double balanceAfterTransaction = account.getBalance() + amount;
                    account.setBalance(balanceAfterTransaction);
                    Transaction transaction = new Transaction(accountName, amount, postedAt, note, balanceAfterTransaction);
                    System.out.println(transaction);
                } else {
                    System.out.println("Account not found");
                }
            } else {
                System.out.println("Invalid command");
            }
        }

        scanner.close();
    }
}