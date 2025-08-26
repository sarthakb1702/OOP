import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Employee Salary Calculator =====");
        System.out.println("1. Worker");
        System.out.println("2. Supervisor");
        System.out.println("3. Manager");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        double basic_pay = sc.nextDouble();

        Employee emp;

        switch (choice) {
            case 1:
                emp = new Worker(id, name, address, dept);
                emp.computeSalary(basic_pay);
                emp.display();
                break;

            case 2:
                emp = new Supervisor(id, name, address, dept);
                emp.computeSalary(basic_pay);
                emp.display();
                break;

            case 3:
                emp = new Manager(id, name, address, dept);
                emp.computeSalary(basic_pay);
                emp.display();
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
