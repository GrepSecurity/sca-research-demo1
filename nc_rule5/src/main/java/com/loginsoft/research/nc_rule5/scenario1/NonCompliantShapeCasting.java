package com.loginsoft.research.nc_rule5.scenario1;

import java.util.function.Supplier;

public class NonCompliantShapeCasting {

    public void runScenario() {
        System.out.println("[NonCompliantShapeCasting] Starting scenario...");

        Shape shape = getShapeFromFactory(() -> new Circle()); // Factory returns unknown subtype
        System.out.println("[NonCompliantShapeCasting] Received shape from factory");

        try {
            Square square = (Square) shape; // Unsafe cast, hidden from static analysis
            System.out.println("[NonCompliantShapeCasting] Square side: " + square.getSide());
        } catch (ClassCastException ex) {
            System.err.println("[NonCompliantShapeCasting] Caught ClassCastException: " + ex.getMessage());
        }

        System.out.println("[NonCompliantShapeCasting] Scenario finished.\n");
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
