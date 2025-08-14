package com.loginsoft.research.nc_java.threads.obfuscated;


import java.util.function.Consumer;

public class MethodReferenceRunner {

    public void execute(Consumer<Runnable> consumer, Runnable task) {
        consumer.accept(task);  // Looks like normal functional usage
    }
}