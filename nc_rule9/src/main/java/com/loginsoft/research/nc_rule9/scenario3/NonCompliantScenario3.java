package com.loginsoft.research.nc_rule9.scenario3;

public class NonCompliantScenario3 {
    public static void run() {
        System.out.println("[NonCompliantScenario3] Loop expected to run 10 times:");
        for (int i = 0; i < 010; i++) { // 010 is octal, equals 8
            System.out.println("  Iteration: " + i);
        }
    }
}
