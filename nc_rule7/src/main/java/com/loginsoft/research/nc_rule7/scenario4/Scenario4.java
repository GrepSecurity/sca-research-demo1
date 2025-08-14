package com.loginsoft.research.nc_rule7.scenario4;

public class Scenario4 {

    public void validateProduct(String name, String category, double price, int stock, boolean active) {
        if (active) { // Depth 1
            System.out.println("Product is active");

            switch (category) { // Depth 2
                case "electronics":
                    if (price > 100.0) { // Depth 3
                        if (stock > 10) { // Depth 4 ❌
                            System.out.println("Valid premium electronic product: " + name);
                        } else {
                            System.out.println("Insufficient stock for premium item: " + name);
                        }
                    } else {
                        System.out.println("Invalid price for premium electronics: " + name);
                    }
                    break;

                case "books":
                    if (price < 50.0) {
                        if (stock > 5) {
                            System.out.println("Valid book: " + name);
                        }
                    }
                    break;

                default:
                    System.out.println("Unsupported category for: " + name);
            }
        } else {
            System.out.println("Inactive product: " + name);
        }
    }
}
