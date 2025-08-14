package com.loginsoft.ncjava.rule2.nc_rule2.bypass;

public class NestedThrowBypass {
    public void execute() {
        System.out.println(">> [NestedThrowBypass] execute()");
        try {
            throw new NullPointerException("Try block throws in NestedThrowBypass");
        } finally {
            System.out.println(">> [NestedThrowBypass] nested try-catch in finally");
            try {
                throw new IllegalStateException("Secondary error in finally");
            } catch (Exception e) {
                System.out.println(">> [NestedThrowBypass] catch block rethrowing");
                throw e;
            }
        }
    }
}