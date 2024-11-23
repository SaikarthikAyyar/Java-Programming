import java.util.Scanner;

interface Shape {
    public void getArea();
}
class Rectangle implements Shape {
    @Override
    public void getArea() {
        Scanner sides = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        float length = sides.nextFloat();
        System.out.print("Enter the breadth of rectangle:");
        float breadth = sides.nextFloat();
        System.out.println("Area of the rectangle is :" + (length*breadth));
    }
}
class Circle implements Shape {
    @Override
    public void getArea() {
        Scanner parameter = new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        float radius = parameter.nextFloat();
        System.out.println("Area of circle is :" + ((3.14)*radius*radius));
    }
}
class Triangle implements Shape {
    @Override
    public void getArea() {
        Scanner sides = new Scanner(System.in);
        System.out.print("Enter side of triangle:");
        float firstSide = sides.nextFloat();
        System.out.print("Enter side of triangle:");
        float secondSide = sides.nextFloat();
        System.out.print("Enter side of triangle:");
        float thirdSide = sides.nextFloat();
        double semiPerimeter = (firstSide + secondSide + thirdSide)*(0.5);
        System.out.println("Area of triangle is :" + java.lang.Math.sqrt((semiPerimeter)*(semiPerimeter-firstSide)*(semiPerimeter-secondSide)*(semiPerimeter-thirdSide)));
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle();
        Circle shape2 = new Circle();
        Triangle shape3 = new Triangle();
        shape1.getArea();
        shape2.getArea();
        shape3.getArea();
    }
}
