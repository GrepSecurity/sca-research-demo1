package com.loginsoft.research.nc_java.threads.processor;

import org.springframework.stereotype.Component;

@Component
public class BatchProcessor {

    public void processBatch() {
        System.out.println("[BatchProcessor] Starting batch of 3 tasks...");

        for (int i = 1; i <= 3; i++) {
            Thread task = new Thread(() ->
                    System.out.printf("[BatchProcessor] Task running in thread: %s%n", Thread.currentThread().getName())
            );

            // ❌ Non-compliant: runs all 3 tasks sequentially in main thread
            task.run();
        }
    }
}
