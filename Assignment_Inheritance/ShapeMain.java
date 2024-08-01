package Learnmaxxing.Assignment_Inheritance;

public class ShapeMain {
    public static void main(String[] args) {
    Shape circle = new Circle(5);
    circle.display();
    Shape rectangle = new Rectangle(4, 6);
    rectangle.display();
    Shape triangle = new Triangle(3, 4, 3, 4, 5);
    triangle.display();
    Shape square = new Square(4);
    square.display();
    }
}
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void display() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void display() {
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        super.display();
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    @Override
    public void display() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + length + ", Width: " + width);
        super.display();
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    @Override
    public void display() {
        System.out.println("Shape: Triangle");
        System.out.println("Base: " + base + ", Height: " + height);
        System.out.println("Sides: " + sideA + ", " + sideB + ", " + sideC);
        super.display();
    }
}
class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
    @Override
    public void display() {
        System.out.println("Shape: Square");
        System.out.println("Side: " + side);
        super.display();
    }
}
