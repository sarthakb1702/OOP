import java.util.Scanner;

class Manager extends Employee {
    Manager(int employee_id, String name, String address, String department) {
        super(employee_id, name, address, department);
    }


    public void computeSalary(double basic_pay) {
        double hra = 0.2 * basic_pay;
        double da = 0.1 * basic_pay;
        salary = basic_pay +hra+da;
    }
}
