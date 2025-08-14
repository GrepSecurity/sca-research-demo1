package com.loginsoft.research.nc_java.threads;

import com.loginsoft.research.nc_java.threads.handler.HiddenRunCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HiddenRunCall {

    private final HiddenRunCaller hiddenRunCaller;

    @Autowired
    public HiddenRunCall(HiddenRunCaller hiddenRunCaller) {
        this.hiddenRunCaller = hiddenRunCaller;
    }

    public void runExample() {
        System.out.println("\n[HiddenRunCall] Triggering HiddenRunCaller...");
        hiddenRunCaller.process();
    }
}
