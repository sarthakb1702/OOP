//public class Shape {
//    protected  double side 1;
//    protected double side 2
//    shape(){
//    }
//    double area(){
//        return 0;
//    }
//    double perimeter(){
//        return 0;
//    }
//}
//class quadrilateral extends Shape {
//    double Area(){
//        return side 1*side 2;
//    }
//}
//class circle extends Shape{
//    double area(){
//        return  3.14* side 1;
//    }
//}
//class Triangle extends Shape{
//    double area(){
//        return
//    }
//}
public class Shape {
    double area() {
        return 0;
    }
    double perimeter() {
        return 0;
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}
class Triangle extends Shape {
    double a, b, c;
    Triangle(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double perimeter() {
        return a + b + c;
    }
}
class Quadrilateral extends Shape {
    double s1, s2, s3, s4;
    Quadrilateral(double a, double b, double c, double d) {
        s1 = a;
        s2 = b;
        s3 = c;
        s4 = d;
    }
    double perimeter() {
        return s1 + s2 + s3 + s4;
    }
}