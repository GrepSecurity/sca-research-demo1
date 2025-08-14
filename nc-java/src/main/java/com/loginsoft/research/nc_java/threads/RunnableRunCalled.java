package com.loginsoft.research.nc_java.threads;

import com.loginsoft.research.nc_java.threads.executor.RunnableRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunnableRunCalled {

    private final RunnableRunner runnableRunner;

    @Autowired
    public RunnableRunCalled(RunnableRunner runnableRunner) {
        this.runnableRunner = runnableRunner;
    }

    public void runExample() {
        System.out.println("\n[RunnableRunCalled] Triggering RunnableRunner...");
        runnableRunner.runTask();
    }
}
