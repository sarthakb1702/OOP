public class Person {
    private String name;
    private int age;
    private String address;
    private long mobilenum;

    // Default constructor
    public Person() {
        this.name = "Sarthak";
        this.age = 18;
        this.address = "Shevgaon";
        this.mobilenum =123456789;
    }

    // Parameterized constructor
    public Person(String name, int age, String address, long mobilenum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobilenum = mobilenum;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
        this.mobilenum = other.mobilenum;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobilenum);
        System.out.println();
    }
}

