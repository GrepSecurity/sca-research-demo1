package com.loginsoft.research.nc_java.threads.util;

public class ThreadUtils {

    public static void execute(Thread thread) {
        System.out.println("[ThreadUtils] Running thread via utility...");

        // ❌ Non-compliant: runs in the caller's thread
        thread.run();
    }
}
