package com.loginsoft.research.nc_java.threads.executor;

import com.loginsoft.research.nc_java.threads.factory.TaskFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunnableRunner {

    private final TaskFactory taskFactory;

    @Autowired
    public RunnableRunner(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }

    public void runTask() {
        Runnable r = taskFactory.getTask("IndexingJob");
        Thread t = new Thread(r);

        // ❌ Non-compliant: executes directly in main thread
        t.run();
    }
}
