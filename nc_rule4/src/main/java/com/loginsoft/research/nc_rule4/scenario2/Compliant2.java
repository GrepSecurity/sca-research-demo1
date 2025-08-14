package com.loginsoft.research.nc_rule4.scenario2;

import org.springframework.data.domain.PageRequest;

public class Compliant2 {
    public void run() {
        System.out.println("[Compliant2] Invoked - using valid PageRequest.of(0, 10)");
        PageRequest pageRequest = PageRequest.of(0, 10); // ✅ safe
        System.out.println("[Compliant2] PageRequest created: " + pageRequest);
    }
}
