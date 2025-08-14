package com.loginsoft.research.nc_rule10.scenario1.compliant;

public class CompliantRunner {

    public static void run() {
        System.out.println("==== Compliant Scenario 1 ====");
        MyServiceForTest service = new MyServiceForTest();
        System.out.println("Fetched User: " + service.fetchUser());
        System.out.println("Computed Score: " + service.computeScore());
        service.printInfo();
    }
}