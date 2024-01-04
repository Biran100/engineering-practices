package org.examples.patternmatching;

import org.examples.model.Circle;
import org.examples.model.Rectangle;

public class Switch {
    public static void main(String[] args) {

        var shapeTypeJava17 = getShapeTypeJava17(new Rectangle(5, 10));

        var shapeTypeJava21 = getShapeTypeJava21(new Rectangle(5, 10));

        System.out.println("shapeTypeJava17: " + shapeTypeJava17);
        System.out.println("shapeTypeJava21: " + shapeTypeJava21);
    }


    private static String getShapeTypeJava17(Object shape) {
        if (shape instanceof Circle c) {
            return "It's a circle with radius: " + c.radius();
        } else if (shape instanceof Rectangle r) {
            return "It's a rectangle with dimensions: " + r.length() + "x" + r.width();
        } else if (shape == null) {
            return "No shape provided";
        } else {
            return "Unknown shape";
        }
    }

    private static String getShapeTypeJava21(Object shape) {
        return switch (shape) {
            case Circle c -> "It's a circle with radius: " + c.radius();
            case Rectangle r -> "It's a rectangle with dimensions: " + r.length() + "x" + r.width();
            case null -> "No shape provided";
            default -> "Unknown shape";
        };
    }
}




