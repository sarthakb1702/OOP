import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shapes s=new Shapes ();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println(("Which operation you want to perform ? \n 1)Area of rectangle \n 2)Area of triangle \n 3)Area of circle \n 4)Perinmeter of rectangle \n 5)Circumference of circle"));
            int n =sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter the length of rectangle");
                    double r=sc.nextDouble();
                    System.out.println("Enter the breadth of rectangle");
                    double b=sc.nextDouble();
                    System.out.println("Area of rectangle is"+s.area(r,b));
                    break;
                case 2:
                    System.out.println("Enter the base of triangle");
                    int r1=sc.nextInt();
                    System.out.println("Enter the height of triangle");
                    double h=sc.nextDouble();
                    System.out.println("Area of triangle is"+s.area(h,r1));
                    break;
                case 3:
                    System.out.println("Enter the radius of circle");
                    double r2=sc.nextDouble();
                    System.out.println("Area of circle"+s.area(r2));
                    break;
                case 4:
                    System.out.println("enter length of rectangle");
                    double r3=sc.nextDouble();
                    System.out.println("enter breadth of rectangle");
                    double b3=sc.nextDouble();
                    System.out.println("Perimeter of rectangle is"+s.perimeter(r3,b3));
                    break;
                case 5:
                    System.out.println("Enter the radius of circle");
                    double r4=sc.nextDouble();
                    System.out.println("Circumference"+s.perimeter(r4));
                    break;

                    default:
                        System.out.println("Invalid input");
                        break;


            }
        }


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}