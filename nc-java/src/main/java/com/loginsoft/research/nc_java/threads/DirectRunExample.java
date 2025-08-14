package com.loginsoft.research.nc_java.threads;

import com.loginsoft.research.nc_java.threads.service.TaskRunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DirectRunExample {

    private final TaskRunnerService taskRunnerService;

    @Autowired
    public DirectRunExample(TaskRunnerService taskRunnerService) {
        this.taskRunnerService = taskRunnerService;
    }

    public void runExample() {
        System.out.println("\n[DirectRunExample] Triggering TaskRunnerService...");
        taskRunnerService.executeTask();
    }
}
