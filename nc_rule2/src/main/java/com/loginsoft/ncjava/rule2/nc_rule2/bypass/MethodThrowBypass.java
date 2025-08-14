package com.loginsoft.ncjava.rule2.nc_rule2.bypass;

public class MethodThrowBypass {
    public void execute() {
        System.out.println(">> [MethodThrowBypass] execute()");
        try {
            throw new IllegalArgumentException("Try block throws in MethodThrowBypass");
        } finally {
            System.out.println(">> [MethodThrowBypass] calling cleanup()");
            cleanup();
        }
    }

    private void cleanup() {
        System.out.println(">> [MethodThrowBypass] cleanup() throws");
        throw new RuntimeException("Indirect throw inside finally via method");
    }
}
