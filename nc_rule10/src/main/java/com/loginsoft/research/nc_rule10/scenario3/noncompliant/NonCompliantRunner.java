package com.loginsoft.research.nc_rule10.scenario3.noncompliant;

import com.loginsoft.research.nc_rule10.scenario3.DataService;
import static org.mockito.Mockito.*;

public class NonCompliantRunner {
    public static void run() {
        System.out.println("==== Non-Compliant Scenario 3 ====");
        DataService service = mock(DataService.class); // Noncompliant
        when(service.fetchData()).thenReturn("mockedData");
        when(service.processData()).thenReturn("mockedProcessed");

        System.out.println("Fetched: " + service.fetchData());
        System.out.println("Processed: " + service.processData());
    }
}