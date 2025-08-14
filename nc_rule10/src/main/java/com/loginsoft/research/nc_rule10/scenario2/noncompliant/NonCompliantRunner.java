package com.loginsoft.research.nc_rule10.scenario2.noncompliant;

import com.loginsoft.research.nc_rule10.scenario2.BaseService;
import static org.mockito.Mockito.*;

public class NonCompliantRunner {

    public static void run() {
        System.out.println("==== Non-Compliant Scenario 2 ====");
        BaseService service = mock(BaseService.class); // Noncompliant
        when(service.getCustomer()).thenReturn("mockedCustomer");
        when(service.calculateDiscount()).thenReturn(50);

        System.out.println("Customer: " + service.getCustomer());
        System.out.println("Discount: " + service.calculateDiscount());
    }
}