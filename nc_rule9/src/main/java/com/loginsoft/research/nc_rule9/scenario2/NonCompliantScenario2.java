package com.loginsoft.research.nc_rule9.scenario2;

public class NonCompliantScenario2 {
    public static void run() {
        int[] data = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        int index = 07; // Octal 07 is decimal 7
        System.out.println("[NonCompliantScenario2] Using octal index 07: " + index);
        System.out.println("[NonCompliantScenario2] Value at index: " + data[index]);

        index = 010; // Octal 010 = decimal 8 (unexpected!)
        System.out.println("[NonCompliantScenario2] Using octal index 010 (expecting 10!): " + index);
        System.out.println("[NonCompliantScenario2] Value at index: " + data[index]);
    }
}
