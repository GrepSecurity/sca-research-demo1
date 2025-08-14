package com.loginsoft.research.nc_rule9.scenario4;

public class NonCompliantScenario4 {
    public static void run() {
        int permission = 0755; // Octal permission, may be misunderstood
        System.out.println("[NonCompliantScenario4] File permission in octal (0755) interpreted as: " + permission);
    }
}
