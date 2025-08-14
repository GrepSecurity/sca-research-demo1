package com.loginsoft.research.nc_rule6.scenario2;

public class NonCompliant_PrivateFinalizeMethod {

    public void finalize(String msg) {
        System.out.println("[NonCompliant] finalize(String) — overload, not an override");
    }

    public void trigger() {
        System.out.println("[NonCompliant] finalize(String) defined but not called");
    }
}
