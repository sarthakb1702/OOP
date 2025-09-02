public class Shapes {
    double perimeter(double r){
        return 2*3.14*r;
    }
    static double area(double r){
        return 3.14*r*r;
    }
    double perimeter(double length,double breadth){
        return 2*(length+breadth);
    }
    double area(double length,double breadth){
        return length*breadth;
    }
    double perimeter(double side1,double side2,double side3){
        return side1+side2+side3;
    }
    double area(int base,double height){
        return 0.5*base*height;
    }
}
