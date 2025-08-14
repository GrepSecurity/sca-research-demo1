package com.loginsoft.research.nc_java.threads.handler;

import com.loginsoft.research.nc_java.threads.util.ThreadUtils;
import org.springframework.stereotype.Component;

@Component
public class HiddenRunCaller {

    public void process() {
        Thread t = new Thread(() ->
                System.out.printf("[HiddenRunCaller] Executing logic in thread: %s%n", Thread.currentThread().getName())
        );

        ThreadUtils.execute(t);
    }
}
