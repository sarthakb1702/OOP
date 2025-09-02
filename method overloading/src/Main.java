import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();    //It invokes default constructor
        Scanner sc = new Scanner(System.in);
        while (true){

        System.out.println("Enter which operation you want to perform:\nEnter 1 to find Circumference of Circle\nEnter 2 to find Area of Circle\nEnter 3 to find Perimeter of rectangle\nEnter 4 to find Area of Rectangle\nEnter 5 to find Perimeter of triangle\nEnter 6 to find Area of triangle\nEnter 7 7 to exit the program");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                // Case for finding circumference of circle
                System.out.println("Enter the radius of Circle");
                double r = sc.nextDouble();

                System.out.println("Circumference of circle is "+s.perimeter(r));
                break;
            case 2:
                // Case for finding Area of circle
                System.out.println("Enter the radius of Circle");
                r=sc.nextDouble();
                System.out.println("Area of circle is "+Shapes.area(r));
                break;
            case 3:
                // Case for finding perimeter of rectangle
                System.out.println("Enter the length of rectangle");
                double l = sc.nextDouble();
                System.out.println("Enter the breadth of rectangle");
                double b = sc.nextDouble();
                System.out.println("Perimeter of rectangle is "+s.perimeter(l,b));
                break;
            case 4:
                // Case for finding Area of rectangle
                System.out.println("Enter the length of rectangle");
                l=sc.nextDouble();
                System.out.println("Enter the breadth of rectangle");
                b = sc.nextDouble();
                System.out.println("Area of rectangle is "+s.area(l,b));
                break;
            case 5:
                // Case for finding perimeter of Triangle
                System.out.println("Enter the length of 1st side of triangle");
                double s1 = sc.nextDouble();
                System.out.println("Enter the length of 2nd side of triangle");
                double s2 = sc.nextDouble();
                System.out.println("Enter the length of 3rd side of triangle");
                double s3 = sc.nextDouble();
                System.out.println("Perimeter of triangle is "+s.perimeter(s1,s2,s3));
                break;
            case 6:
                // Case for finding Area of Triangle
                System.out.println("Enter the base of triangle");
                int base = sc.nextInt();
                System.out.println("Enter the height of triangle");
                double height = sc.nextDouble();
                System.out.println("Area of triangle is "+s.area(base,height));
                break;
            case 7:
                return;
        }
        }
        }
    }
