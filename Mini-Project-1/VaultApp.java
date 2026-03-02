import java.util.Scanner;

public class VaultApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vault vault = new Vault();

        while (true) {
            System.out.println("\n--- PASSWORD VAULT ---");
            System.out.println("1. Add Credential");
            System.out.println("2. View Credential");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter website: ");
                String website = sc.nextLine();

                System.out.print("Enter username: ");
                String username = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                Credential c = new Credential(website, username, password);
                vault.addCredential(c);

            } else if (choice == 2) {
                System.out.print("Enter website: ");
                String website = sc.nextLine();

                System.out.print("Enter master key: ");
                String masterKey = sc.nextLine();

                vault.viewCredential(website, masterKey);

            } else if (choice == 3) {
                System.out.println("🔒 Exiting Vault. Goodbye!");
                break;
            } else {
                System.out.println("❌ Invalid option.");
            }
        }

        sc.close();
    }
}