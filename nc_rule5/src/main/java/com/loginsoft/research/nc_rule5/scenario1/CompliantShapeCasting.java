package com.loginsoft.research.nc_rule5.scenario1;

import java.util.function.Supplier;

public class CompliantShapeCasting {

    public void runScenario() {
        System.out.println("[CompliantShapeCasting] Starting scenario...");

        Shape shape = getShapeFromFactory(() -> new Circle());
        System.out.println("[CompliantShapeCasting] Received shape from factory");

        if (shape instanceof Square square) {
            System.out.println("[CompliantShapeCasting] Square side: " + square.getSide());
        } else if (shape instanceof Circle circle) {
            System.out.println("[CompliantShapeCasting] Circle radius: " + circle.getRadius());
        } else {
            System.out.println("[CompliantShapeCasting] Unknown shape type");
        }

        System.out.println("[CompliantShapeCasting] Scenario finished.\n");
    }

    static Shape getShapeFromFactory(Supplier<Shape> factory) {
        return factory.get();
    }

    interface Shape {}
    static class Circle implements Shape {
        public double getRadius() {
            return 10.0;
        }
    }

    static class Square implements Shape {
        public double getSide() {
            return 20.0;
        }
    }
}
