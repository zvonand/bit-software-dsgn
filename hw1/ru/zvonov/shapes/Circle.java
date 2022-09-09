package ru.zvonov.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new ArithmeticException("Circle radius cannot be negative");
        }
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}
