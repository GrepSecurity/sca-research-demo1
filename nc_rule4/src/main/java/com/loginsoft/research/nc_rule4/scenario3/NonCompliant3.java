package com.loginsoft.research.nc_rule4.scenario3;

public class NonCompliant3 {
    public void run() {
        System.out.println("[NonCompliant3] Invoked - attempting to start a thread twice");

        Thread worker = new Thread(() -> {
            System.out.println("[NonCompliant3] Thread running...");
        });

        worker.start();
        System.out.println("[NonCompliant3] First start called");

        // 🚨 IllegalThreadStateException — cannot restart the same thread
        worker.start();
        System.out.println("[NonCompliant3] Second start called");
    }
}
