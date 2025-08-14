package com.loginsoft.research.nc_java.threads.service;

import org.springframework.stereotype.Service;

@Service
public class TaskRunnerService {

    public void executeTask() {
        Thread thread = new Thread(() ->
                System.out.println("[TaskRunnerService] Task executed in thread: " + Thread.currentThread().getName())
        );

        // ❌ Non-compliant: executes inline on main thread
        thread.run();
    }
}
