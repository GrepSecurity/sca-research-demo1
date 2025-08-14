package com.loginsoft.research.nc_rule4.scenario3;

public class Compliant3 {
    public void run() {
        System.out.println("[Compliant3] Invoked - creating new thread for each task");

        Thread worker = new Thread(() -> {
            System.out.println("[Compliant3] First thread running...");
        });
        worker.start();

        try {
            worker.join(); // Wait for first to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread secondWorker = new Thread(() -> {
            System.out.println("[Compliant3] Second thread running...");
        });
        secondWorker.start();

        try {
            secondWorker.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("[Compliant3] Both threads completed safely");
    }
}
