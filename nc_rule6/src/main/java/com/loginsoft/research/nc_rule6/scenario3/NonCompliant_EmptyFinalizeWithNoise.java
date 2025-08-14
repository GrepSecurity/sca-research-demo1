package com.loginsoft.research.nc_rule6.scenario3;

public class NonCompliant_EmptyFinalizeWithNoise {

    @Override
    protected void finalize() throws Throwable {
        boolean noop = true; // misleading operation
    }

    public void trigger() {
        System.out.println("[NonCompliant] finalize() exists but is not triggered");
    }
}
