package org.examples.patternmatching;


import org.examples.model.Circle;
import org.examples.model.Rectangle;
import org.examples.model.Shape;
import org.examples.model.Square;

public class SealedAndSwitch {
    public static void main(String[] args) {
        // Creating different shape instances
        var circleShape = new Circle(10);
        var rectangleShape = new Rectangle(5, 3);
        var squareShape = new Square(4);

        // Example with Circle
        printShapeInfo(circleShape);

        // Example with Rectangle
        printShapeInfo(rectangleShape);

        // Example with Square
        printShapeInfo(squareShape);
    }

    private static void printShapeInfo(Shape shape) {
        // Using pattern matching with switch
        var shapeInfo = switch (shape) {
            case Circle c -> "Circle with radius: " + c.radius();
            case Rectangle r -> "Rectangle with length: " + r.length() + " and width: " + r.width();
            case Square s -> "Square with side: " + s.side();
            default -> "unknown shape";
        };

        System.out.println(shapeInfo);
    }
}




