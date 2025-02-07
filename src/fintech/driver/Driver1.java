package fintech.driver;
import java.util.Scanner;
import fintech.model.Account;

/**
 * @author 12S23002 Fernando Silitonga
 * @author 12S23044 Gracia Pardede
 */

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca masukkan
        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

        // Memastikan perintah adalah "create-account"
        if (command.equals("create-account")) {
            // Membuat akun baru
            Account account = new Account(owner, accountName);

            // Menampilkan informasi akun
            System.out.println(account);
        } else {
            System.out.println("Invalid command");
        }

        scanner.close();
    }
}