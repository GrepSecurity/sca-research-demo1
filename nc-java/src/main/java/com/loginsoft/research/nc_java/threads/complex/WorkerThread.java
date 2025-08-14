package com.loginsoft.research.nc_java.threads.complex;

public class WorkerThread extends Thread {

    private final String jobName;

    public WorkerThread(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void run() {
        System.out.printf("[WorkerThread] Running job '%s' on thread: %s%n", jobName, Thread.currentThread().getName());
    }

    // ❌ Misleading abstraction — appears asynchronous but calls run() directly
    public void performWork() {
        System.out.println("[WorkerThread] performWork() called... delegating to run()");
        this.run(); // ❌ Non-compliant
    }
}
