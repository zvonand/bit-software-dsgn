import ru.zvonov.shapes.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12.123);
        System.out.println("Circle area: " + circle.getArea());

        Rectangle rect = new Rectangle(10, 12);
        System.out.println("Rectangle area: " + rect.getArea());

        Square square = new Square(10);
        System.out.println("Square area: " + square.getArea());
    }
}