package com.loginsoft.research.nc_java.threads;

import com.loginsoft.research.nc_java.threads.component.TaskExecutorComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OverriddenRunCalledDirectly {

    private final TaskExecutorComponent executorComponent;

    @Autowired
    public OverriddenRunCalledDirectly(TaskExecutorComponent executorComponent) {
        this.executorComponent = executorComponent;
    }

    public void runExample() {
        System.out.println("\n[OverriddenRunCalledDirectly] Triggering TaskExecutorComponent...");
        executorComponent.executeCustomTask();
    }
}
