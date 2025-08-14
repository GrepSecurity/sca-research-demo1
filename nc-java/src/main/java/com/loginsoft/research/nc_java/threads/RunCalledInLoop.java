package com.loginsoft.research.nc_java.threads;

import com.loginsoft.research.nc_java.threads.processor.BatchProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunCalledInLoop {

    private final BatchProcessor batchProcessor;

    @Autowired
    public RunCalledInLoop(BatchProcessor batchProcessor) {
        this.batchProcessor = batchProcessor;
    }

    public void runExample() {
        System.out.println("\n[RunCalledInLoop] Triggering BatchProcessor...");
        batchProcessor.processBatch();
    }
}
