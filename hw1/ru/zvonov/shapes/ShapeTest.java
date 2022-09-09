package ru.zvonov.shapes;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @org.junit.jupiter.api.Test
    void getArea() {
        //test area for valid params
        for (double i: new double[]{0, 10.9828, 1232}) {
            final Circle circle = new Circle(i);
            assertEquals(circle.getArea(), Math.PI * i * i);
            final Square square = new Square(i);
            assertEquals(square.getArea(), i * i);

            for (double j: new double[]{0, 21.1212, 878}) {
                final Rectangle rect = new Rectangle(i, j);
                assertEquals(rect.getArea(), i * j);
            }

        }

        //test exception is thrown when params are negative
        Throwable neg_circle = assertThrows(ArithmeticException.class, () -> new Circle(-1));
        assertEquals("Circle radius cannot be negative", neg_circle.getMessage());

        Throwable neg_square = assertThrows(ArithmeticException.class, () -> new Square(-1));
        assertEquals("Rectangle side cannot be negative", neg_square.getMessage());

        for (double i: new double[]{-1, 1}) {
            for (double j: new double[]{-1, 1}) {
                if (i < 0 || j < 0) {
                    Throwable neg_rect = assertThrows(ArithmeticException.class, () -> new Rectangle(i, j));
                    assertEquals("Rectangle side cannot be negative", neg_rect.getMessage());
                }
            }
        }
    }
}