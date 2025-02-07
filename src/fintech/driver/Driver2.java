package fintech.driver;

import fintech.model.Transaction;
import java.util.Scanner;

/**
 * @autors 12S23002 Fernando Silitonga
 * @autors 12S23044 Gracia Pardede
 */

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca masukkan
        String command = scanner.nextLine();
        String accountName = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String postedAtStr = scanner.nextLine();
        String note = scanner.nextLine();

        // Memastikan perintah adalah "create-transaction"
        if (command.equals("create-transaction")) {
            // Mengonversi postedAtStr ke LocalDateTime
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime postedAt = LocalDateTime.parse(postedAtStr, formatter);

            // Membuat transaksi baru
            double balanceAfterTransaction = 0.0; // Asumsikan saldo awal adalah 0.0
            Transaction transaction = new Transaction(accountName, amount, postedAt, note, balanceAfterTransaction);

            // Menampilkan informasi transaksi
            System.out.println(transaction);
        } else {
            System.out.println("Invalid command");
        }

        scanner.close();
    }
}