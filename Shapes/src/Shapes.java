public class Shapes {
     double area(double length, double breadth){
        return length*breadth;
    }
    double area(int base,double height){
        return 0.5*base*height;
    }
     double area(double radius){
        return 3.14*radius*radius;
    }
     double  perimeter(double length, double breadth){
        return 2*(length+breadth);
    }
     double  perimeter(double radius){
        return 2*3.14*radius;
    }

}
