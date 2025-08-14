package com.loginsoft.research.nc_java.threads.obfuscated;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
public class MethodHandleThreadRunner {
    public void execute(Thread thread) {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            MethodHandle mh = lookup.findVirtual(Thread.class, "run", MethodType.methodType(void.class));
            System.out.println("[MethodHandleThreadRunner] Invoking 'run' via MethodHandle...");
            mh.invoke(thread);  // ❌ Calls Thread.run(), but CodeQL will not detect
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
