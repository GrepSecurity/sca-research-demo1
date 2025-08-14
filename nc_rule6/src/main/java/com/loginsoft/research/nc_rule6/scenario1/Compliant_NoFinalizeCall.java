package com.loginsoft.research.nc_rule6.scenario1;

public class Compliant_NoFinalizeCall {

    static class Resource implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("[Compliant] Resource closed via close()");
        }
    }

    public void trigger() {
        try (Resource resource = new Resource()) {
            System.out.println("[Compliant] Using resource safely");
        }
    }
}
