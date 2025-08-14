package com.loginsoft.research.nc_rule10.scenario1.noncompliant;

import com.loginsoft.research.nc_rule10.scenario1.MyService;

import static org.mockito.Mockito.*;

public class NonCompliantRunner {

    public static void run() {
        System.out.println("==== Non-Compliant Scenario 1 ====");
        MyService mockService = mock(MyService.class); // Noncompliant

        when(mockService.fetchUser()).thenReturn("mockedUser");
        when(mockService.computeScore()).thenReturn(99);

        System.out.println("Fetched User: " + mockService.fetchUser());
        System.out.println("Computed Score: " + mockService.computeScore());
    }
}