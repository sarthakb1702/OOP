//public class Main {
//    public static void main(String[] args) {
//        Shapes shape = new Shapes();
//        double rectArea = shape.area(10, 5);
//        double rectPerimeter = shape.perimeter(10, 5);
//        System.out.println("Rectangle - Area: " + rectArea + ", Perimeter: " + rectPerimeter);
//        double triArea = shape.area(3, 4, 5);
//        double triPerimeter = shape.perimeter(3, 4, 5);
//        System.out.println("Triangle - Area: " + triArea + ", Perimeter: " + triPerimeter);
//        double quadArea = shape.area(8, 6, 4, true);
//        double quadPerimeter = shape.perimeter(5, 6, 7, 8);
//        System.out.println("Quadrilateral (Trapezium) - Area: " + quadArea + ", Perimeter: " + quadPerimeter);
//    }
//}
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Shapes s = new Shapes();
//        System.out.println("Enter Your Choice no.\n1. Rectangle\n2. Triangle\n3. Quadrilateral");
//        int ch = sc.nextInt();
//        if (ch == 1) {
//            System.out.print("Length: ");
//            double l = sc.nextDouble();
//            System.out.print("Width: ");
//            double w = sc.nextDouble();
//            System.out.println("Area: " + s.area(l, w));
//            System.out.println("Perimeter: " + s.perimeter(l, w));
//        } else if (ch == 2) {
//            System.out.print("Side a: ");
//            double a = sc.nextDouble();
//            System.out.print("Side b: ");
//            double b = sc.nextDouble();
//            System.out.print("Side c: ");
//            double c = sc.nextDouble();
//            System.out.println("Area: " + s.area(a, b, c));
//            System.out.println("Perimeter: " + s.perimeter(a, b, c));
//        } else if (ch == 3) {
//            System.out.print("Side 1: ");
//            double a = sc.nextDouble();
//            System.out.print("Side 2: ");
//            double b = sc.nextDouble();
//            System.out.print("Side 3: ");
//            double c = sc.nextDouble();
//            System.out.print("Side 4: ");
//            double d = sc.nextDouble();
//            System.out.println("Perimeter: " + s.perimeter(a, b, c, d));
//        } else {
//            System.out.println("Invalid choice");
//        }
//    }
//}
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Shapes shape = new Shapes();
//        System.out.println("Enter a choice no. you want:\n1) Rectangle\n2) Triangle\n3) Quadrilateral");
//        int choice = sc.nextInt();
//        switch (choice){
//            case 1:
//                System.out.print("Enter length: ");
//                double length = sc.nextDouble();
//                System.out.print("Enter width: ");
//                double width = sc.nextDouble();
//                System.out.println("Rectangle - Area: " + shape.area(length, width));
//                System.out.println("Rectangle - Perimeter: " + shape.perimeter(length, width));
//                break;
//            case 2:
//                System.out.print("Enter side a: ");
//                double a = sc.nextDouble();
//                System.out.print("Enter side b: ");
//                double b = sc.nextDouble();
//                System.out.print("Enter side c: ");
//                double c = sc.nextDouble();
//                System.out.println("Triangle - Area: " + shape.area(a, b, c));
//                System.out.println("Triangle - Perimeter: " + shape.perimeter(a, b, c));
//                break;
//            case 3:
//                boolean isTrapezium = sc.nextBoolean();
//                if (isTrapezium) {
//                    System.out.print("Enter base1: ");
//                    double base1 = sc.nextDouble();
//                    System.out.print("Enter base2: ");
//                    double base2 = sc.nextDouble();
//                    System.out.print("Enter height: ");
//                    double height = sc.nextDouble();
//                    System.out.println("Trapezium - Area: " + shape.area(base1, base2, height, true));
//                }
//                System.out.print("Enter side1: ");
//                double s1 = sc.nextDouble();
//                System.out.print("Enter side2: ");
//                double s2 = sc.nextDouble();
//                System.out.print("Enter side3: ");
//                double s3 = sc.nextDouble();
//                System.out.print("Enter side4: ");
//                double s4 = sc.nextDouble();
//                System.out.println("Quadrilateral - Perimeter: " + shape.perimeter(s1, s2, s3, s4));
//                break;
//            default:
//                System.out.println("Invalid choice.");
//        }
//    }
//}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape=new Shape();
        System.out.println("Enter your choice:");
        System.out.println("1) method overloading ");
        System.out.println("2) method over riding");
        System.out.println("Enter your choice shape no.:");
        System.out.println("1) Rectangle");
        System.out.println("2) Triangle");
        System.out.println("3) Quadrilateral");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                shape = new Rectangle(length, width);
                System.out.println("Area: " + shape.area());
                System.out.println("Perimeter: " + shape.perimeter());
                break;
            case 2:
                System.out.print("Enter side a: ");
                double a = sc.nextDouble();
                System.out.print("Enter side b: ");
                double b = sc.nextDouble();
                System.out.print("Enter side c: ");
                double c = sc.nextDouble();
                shape = new Triangle(a, b, c);
                System.out.println("Area: " + shape.area());
                System.out.println("Perimeter: " + shape.perimeter());
                break;
            case 3:
                System.out.print("Enter side1: ");
                double s1 = sc.nextDouble();
                System.out.print("Enter side2: ");
                double s2 = sc.nextDouble();
                System.out.print("Enter side3: ");
                double s3 = sc.nextDouble();
                System.out.print("Enter side4: ");
                double s4 = sc.nextDouble();
                shape = new Quadrilateral(s1, s2, s3, s4);
                System.out.println("Perimeter: " + shape.perimeter());
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

