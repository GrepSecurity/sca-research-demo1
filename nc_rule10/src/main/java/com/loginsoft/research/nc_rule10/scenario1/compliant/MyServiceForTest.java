package com.loginsoft.research.nc_rule10.scenario1.compliant;

import com.loginsoft.research.nc_rule10.scenario1.MyService;

public class MyServiceForTest extends MyService {

    @Override
    public String fetchUser() {
        return "testUser";
    }

    @Override
    public int computeScore() {
        return 42;
    }
}