package com.loginsoft.research.nc_java.threads.obfuscated;

import java.lang.reflect.Method;

public class ReflectiveThreadRunner {

    public void execute(Thread thread) {
        try {
            Method method = thread.getClass().getMethod("run");
            method.setAccessible(true);
            //thread.run();
            System.out.println("[ReflectiveThreadRunner] Invoking 'run' via reflection...");
            method.invoke(thread);  // ❌ This is a direct call but NOT detected by CodeQL

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}