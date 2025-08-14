package com.loginsoft.research.nc_java.threads.model;

public class CustomThread extends Thread {

    private final String taskName;

    public CustomThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.printf("[CustomThread] Executing task '%s' on thread: %s%n", taskName, Thread.currentThread().getName());
    }
}
