package ru.zvonov.shapes;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("Rectangle side cannot be negative");
        }
        this.a = a;
        this.b = b;
        this.area = a * b;
    }
}
