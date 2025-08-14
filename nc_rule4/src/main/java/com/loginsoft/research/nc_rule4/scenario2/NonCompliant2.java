package com.loginsoft.research.nc_rule4.scenario2;

import org.springframework.data.domain.PageRequest;

public class NonCompliant2 {
    public void run() {
        System.out.println("[NonCompliant2] Invoked - using PageRequest.of(-1, 10)");
        PageRequest pageRequest = PageRequest.of(-1, 10); // 🚨 throws IllegalArgumentException
        System.out.println("[NonCompliant2] PageRequest created: " + pageRequest);
    }
}
