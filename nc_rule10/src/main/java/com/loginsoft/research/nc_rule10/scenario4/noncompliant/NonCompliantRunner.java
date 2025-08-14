package com.loginsoft.research.nc_rule10.scenario4.noncompliant;

import com.loginsoft.research.nc_rule10.scenario4.GraphQLService;
import static org.mockito.Mockito.*;

public class NonCompliantRunner {
    public static void run() {
        System.out.println("==== Non-Compliant Scenario 4 ====");
        GraphQLService service = mock(GraphQLService.class); // Noncompliant
        when(service.executeQuery()).thenReturn("{ mockData }");
        when(service.parseResponse()).thenReturn("mockParsed");

        System.out.println("Query: " + service.executeQuery());
        System.out.println("Response: " + service.parseResponse());
    }
}