package com.loginsoft.research.nc_rule10.scenario3.compliant;

import com.loginsoft.research.nc_rule10.scenario3.DataService;

public class CompliantRunner {
    public static void run() {
        System.out.println("==== Compliant Scenario 3 ====");
        DataService service = new DataService();
        System.out.println("Fetched: " + service.fetchData());
        System.out.println("Processed: " + service.processData());
    }
}