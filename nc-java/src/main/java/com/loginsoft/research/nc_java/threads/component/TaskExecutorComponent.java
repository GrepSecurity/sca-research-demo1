package com.loginsoft.research.nc_java.threads.component;

import com.loginsoft.research.nc_java.threads.model.CustomThread;
import org.springframework.stereotype.Component;

@Component
public class TaskExecutorComponent {

    public void executeCustomTask() {
        CustomThread thread = new CustomThread("DataSyncJob");

        // ❌ Non-compliant: runs in main thread, no concurrency
        thread.run();
    }
}
