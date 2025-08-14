package com.loginsoft.research.nc_java.threads.scenario;

import org.springframework.stereotype.Component;
import com.loginsoft.research.nc_java.threads.complex.WorkerThread;

@Component
public class ComplexWorkerScenario {

    public void runExample() {
        System.out.println("\n[ComplexWorkerScenario] Triggering WorkerThread...");

        WorkerThread worker = new WorkerThread("VideoEncodingJob");
        worker.performWork(); // ❌ User thinks this is async
    }
}