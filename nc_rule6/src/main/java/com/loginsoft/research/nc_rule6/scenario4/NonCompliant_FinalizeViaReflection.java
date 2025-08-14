package com.loginsoft.research.nc_rule6.scenario4;

import java.lang.reflect.Method;

public class NonCompliant_FinalizeViaReflection {

    public void finalize() {
        System.out.println("[NonCompliant] finalize() method called reflectively");
    }

    public void trigger() {
        try {
            Method m = this.getClass().getDeclaredMethod("finalize");
            m.setAccessible(true);
            m.invoke(this); // ⚠️ Called via reflection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
