package Learnmaxxing.Assignment3;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        MathOperations mo = new MathOperations();

        System.out.println("Int addition: " + mo.add(5, 3));
        System.out.println("Double addition: " + mo.add(5.0, 3.0));
        System.out.println("Int subtraction: " + mo.subtract(5, 3));
        System.out.println("Double subtraction: " + mo.subtract(5.0, 3.0));
        System.out.println("Int multiplication: " + mo.multiply(5, 3));
        System.out.println("Double multiplication: " + mo.multiply(5.0, 3.0));
        System.out.println("Int division: " + mo.divide(5, 3));
        System.out.println("Double division: " + mo.divide(5.0, 3.0));
    }
}
