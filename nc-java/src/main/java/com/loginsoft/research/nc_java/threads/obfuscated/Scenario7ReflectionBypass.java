package com.loginsoft.research.nc_java.threads.obfuscated;

import org.springframework.stereotype.Component;

@Component
public class Scenario7ReflectionBypass {

    public void runExample() {
        System.out.println("\n[Scenario7ReflectionBypass] Running scenario...");

        Thread sneakyThread = new Thread(() ->
                System.out.printf("[Scenario7ReflectionBypass] Executed in thread: %s%n", Thread.currentThread().getName())
        );

        new ReflectiveThreadRunner().execute(sneakyThread);
    }

    @Component
    public static class Scenario8MethodHandleBypass {
        public void runExample() {
            System.out.println("\n[Scenario8MethodHandleBypass] Running scenario...");
            Thread t = new Thread(() ->
                    System.out.printf("[Scenario8] Running on thread: %s%n", Thread.currentThread().getName()));
            new MethodHandleThreadRunner().execute(t);
        }
    }
}