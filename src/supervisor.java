import java.util.Scanner;

class Supervisor extends Employee {
    Supervisor(int employee_id, String name, String address, String department) {
        super(employee_id, name, address, department);
    }

    public void computeSalary(double basic_pay) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of overtime hours: ");
        int overtime = sc.nextInt();
        salary = basic_pay + (overtime * 150);
    }
}
