package Shapes;
class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double doubleArea() {
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public double doublePerimeter() {
        return 2*Math.PI*radius;
    }
}
class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double doublePerimeter() {
        return 2*(length+breadth);
    }

    @Override
    public double doubleArea() {
        return length*breadth;
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        Rectangle rectangle=new Rectangle(5,5);
        System.out.println("The Area of circle:-"+circle.doubleArea());
        System.out.println("The Area of Rectangle:-"+rectangle.doubleArea());
        System.out.println("The Perimeter of Circle:-"+circle.doublePerimeter());
        System.out.println("The Perimeter of Rectangle:-"+rectangle.doublePerimeter());

    }
}

