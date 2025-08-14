package com.loginsoft.research.nc_rule10.scenario4.compliant;

import com.loginsoft.research.nc_rule10.scenario4.GraphQLService;

public class CompliantRunner {
    public static void run() {
        System.out.println("==== Compliant Scenario 4 ====");
        GraphQLService service = new GraphQLService();
        System.out.println("Query: " + service.executeQuery());
        System.out.println("Response: " + service.parseResponse());
    }
}