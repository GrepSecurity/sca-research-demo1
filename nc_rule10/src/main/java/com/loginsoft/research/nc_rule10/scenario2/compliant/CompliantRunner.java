package com.loginsoft.research.nc_rule10.scenario2.compliant;

import com.loginsoft.research.nc_rule10.scenario2.BaseService;

public class CompliantRunner {

    public static void run() {
        System.out.println("==== Compliant Scenario 2 ====");
        BaseService service = new BaseService();
        System.out.println("Customer: " + service.getCustomer());
        System.out.println("Discount: " + service.calculateDiscount());
    }
}