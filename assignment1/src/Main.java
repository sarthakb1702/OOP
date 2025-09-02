import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        Person P1 = new Person();

        System.out.println("Enter name:");
        String name = Sc.nextLine();
        
        System.out.println("Enter age:");
        int age = Sc.nextInt();
        Sc.nextLine();

        System.out.print("Address: ");
        String address = Sc.nextLine();

        System.out.print("Mobile Number: ");
        long mobilenum = Sc.nextLong();

        Person P2=new Person(name, age, address, mobilenum);

        Person P3=new Person(P2);

        System.out.println("\n<----P1---->");
        P1.printDetails();

        System.out.println("\n<----P2---->");
        P2.printDetails();

        System.out.println("\n<----P3---->");
        P3.printDetails();
    }
}
