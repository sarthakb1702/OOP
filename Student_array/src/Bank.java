import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        final int numUsers = 5;
        Account[] accounts = new Account[numUsers];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for 5 users:");
        for (int i = 0; i < numUsers; i++) {
            accounts[i] = new Account();
            System.out.println("\n--- User " + (i + 1) + " ---");
            accounts[i].acceptDetails(scanner);
        }


        System.out.println("\n--------------------------------------------------------");
        System.out.printf("%-15s%-25s%10s%n", "Account No.", "Name", "Balance");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < numUsers; i++) {
            accounts[i].display();
        }

        System.out.println("--------------------------------------------------------");

        scanner.close();
    }
}