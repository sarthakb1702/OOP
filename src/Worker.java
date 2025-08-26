import java.util.Scanner;

class Worker extends Employee {
    Worker(int employee_id, String name, String address, String department) {
        super(employee_id, name, address, department);
    }

    public void computeSalary(double basic_pay) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of working hours: ");
        int hours = sc.nextInt();
        salary = basic_pay + (hours * 100);
    }
}
