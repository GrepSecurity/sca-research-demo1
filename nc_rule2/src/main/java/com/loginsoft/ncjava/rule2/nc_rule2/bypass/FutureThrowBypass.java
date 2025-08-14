package com.loginsoft.ncjava.rule2.nc_rule2.bypass;

import java.util.concurrent.CompletableFuture;

public class FutureThrowBypass {
    public void execute() {
        System.out.println(">> [FutureThrowBypass] execute()");
        try {
            throw new IllegalArgumentException("Try block throws in FutureThrowBypass");
        } finally {
            System.out.println(">> [FutureThrowBypass] running async task");
            CompletableFuture.runAsync(() -> {
                System.out.println(">> [FutureThrowBypass] async task throws");
                throw new RuntimeException("Async throw inside finally");
            });
        }
    }
}