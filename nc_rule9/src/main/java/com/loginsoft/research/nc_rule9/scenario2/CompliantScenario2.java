package com.loginsoft.research.nc_rule9.scenario2;

public class CompliantScenario2 {
    public static void run() {
        int[] data = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        int index = 7;  // Proper decimal usage
        System.out.println("[CompliantScenario2] Using index 7: " + index);
        System.out.println("[CompliantScenario2] Value at index: " + data[index]);

        index = 8; // Correctly accessing 9th element
        System.out.println("[CompliantScenario2] Using index 8: " + index);
        System.out.println("[CompliantScenario2] Value at index: " + data[index]);
    }
}
