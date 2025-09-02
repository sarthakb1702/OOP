//public class Shapes {
//    void Area(double r){
//        System.out.println("Area of the circle:"+ 3.14*r*r);
//    }
//    double Area(double l,double b){
//        System .out.println("Area of the quadrilateral:");
//        return l*b;
//    }
//    void Area (double b,double p){
//
//    }
//}
//
//public class Shapes {
//    public double area(double l, double w) {
//        return l * w;
//    }
//    public double perimeter(double l, double w) {
//        return 2 * (l + w);
//    }
//    public double area(double a, double b, double c) {
//        return (a + b + c) / 3;
//    }
//    public double perimeter(double a, double b, double c) {
//        return a + b + c;
//    }
//    public double perimeter(double a, double b, double c, double d) {
//        return a + b + c + d;
//    }
//}
public class Shapes {
    public double area(double length, double width) {
        return length * width;
    }
    public double perimeter(double length, double width) {
        return 2 * (length + width);
    }
    public double area(double a, double b, double c) {
    return (a + b + c) / 3;
    }
    public double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    public double area(double base1, double base2, double height, boolean isTrapezium) {
        if (isTrapezium) {
            return 0.5 * (base1 + base2) * height;
        } else {
            return -1;
        }
    }
    public double perimeter(double side1, double side2, double side3, double side4) {
        return side1 + side2 + side3 + side4;
    }
}


