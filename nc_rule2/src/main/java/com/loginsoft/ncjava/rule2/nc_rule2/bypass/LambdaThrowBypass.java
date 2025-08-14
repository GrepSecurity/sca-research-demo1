package com.loginsoft.ncjava.rule2.nc_rule2.bypass;


public class LambdaThrowBypass {
    public void execute() {
        System.out.println(">> [LambdaThrowBypass] execute()");
        try {
            throw new IllegalStateException("Try block throws in LambdaThrowBypass");
        } finally {
            System.out.println(">> [LambdaThrowBypass] running lambda");
            Runnable r = () -> {
                System.out.println(">> [LambdaThrowBypass] lambda throws");
                throw new RuntimeException("Lambda throw inside finally");
            };
            r.run();
        }
    }
}
