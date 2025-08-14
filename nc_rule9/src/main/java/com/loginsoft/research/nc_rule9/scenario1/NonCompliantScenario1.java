package com.loginsoft.research.nc_rule9.scenario1;

public class NonCompliantScenario1 {
    public static void run() {
        int myNumber = 2; // Noncompliant - interpreted as octal (value 8)
        System.out.println("[NonCompliantScenario1] Expected 10, but got: " + myNumber);
    }
}
