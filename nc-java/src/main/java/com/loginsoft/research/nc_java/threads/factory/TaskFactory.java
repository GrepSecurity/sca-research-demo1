package com.loginsoft.research.nc_java.threads.factory;

import org.springframework.stereotype.Component;

@Component
public class TaskFactory {

    public Runnable getTask(String name) {
        return () -> System.out.printf("[TaskFactory] Runnable '%s' running in thread: %s%n", name, Thread.currentThread().getName());
    }
}
