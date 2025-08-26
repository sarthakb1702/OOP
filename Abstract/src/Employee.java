public abstract class Employee {
    protected int employee_id;
    protected String name;
    protected String address;
    protected String department;
    protected double salary;

    Employee(int employee_id, String name, String address, String department) {
        this.employee_id = employee_id;
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public abstract void computeSalary(double basic_pay);

    public void display() {
        System.out.println("\nEmployee ID: " + employee_id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
