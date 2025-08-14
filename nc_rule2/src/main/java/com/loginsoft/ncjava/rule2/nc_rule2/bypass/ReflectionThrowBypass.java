package com.loginsoft.ncjava.rule2.nc_rule2.bypass;
import java.lang.reflect.Method;

public class ReflectionThrowBypass {
    public void execute() {
        System.out.println(">> [ReflectionThrowBypass] execute()");
        try {
            throw new RuntimeException("Try block throws in ReflectionThrowBypass");
        } finally {
            System.out.println(">> [ReflectionThrowBypass] invoking thrower via reflection");
            try {
                Method m = ReflectionThrowBypass.class.getDeclaredMethod("doThrow");
                m.setAccessible(true);
                m.invoke(null);
            } catch (Exception ignored) {
                System.out.println(">> [ReflectionThrowBypass] reflection error: " + ignored.getClass().getSimpleName());
            }
        }
    }

    private static void doThrow() {
        System.out.println(">> [ReflectionThrowBypass] doThrow() throws");
        throw new RuntimeException("Throw inside finally via reflection");
    }
}