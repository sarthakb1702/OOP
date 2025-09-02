
import java.util.Scanner;

class Account {

    private int accountNumber;
    private double balance;
    private String name;

    public Account() {
        this.accountNumber = 0;
        this.balance = 0.0;
        this.name = "N/A";
    }

    public void acceptDetails(Scanner scanner) {
        System.out.print("Enter Account Number: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            System.out.print("Enter Account Number: ");
            scanner.next();
        }
        this.accountNumber = scanner.nextInt();

        System.out.print("Enter Name: ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        this.name = scanner.nextLine();

        System.out.print("Enter Balance: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            System.out.print("Enter Balance: ");
            scanner.next(); // Consume the invalid input
        }
        this.balance = scanner.nextDouble();
    }

    public void display() {
        System.out.printf("%-15d%-25s%10.2f%n", accountNumber, name, balance);
    }
}