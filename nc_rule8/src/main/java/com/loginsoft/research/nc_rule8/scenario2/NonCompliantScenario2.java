package com.loginsoft.research.nc_rule8.scenario2;

import org.springframework.stereotype.Component;

@Component
public class NonCompliantScenario2 {

    public enum TaskStage {
        INIT, PROCESS, FINISH
    }

    public void execute() {
        TaskStage stage = TaskStage.PROCESS;

        switch (stage) {
            case INIT:
                System.out.println("Initializing...");
                break;

            case PROCESS:
                prepare: {  // ❌ Non-case label used as logical block inside switch
                    System.out.println("Preparing data...");
                }
                execute: {  // ❌ Another non-case label
                    System.out.println("Executing core logic...");
                }
                cleanup: {  // ❌ Confusing use of labels — not real switch cases
                    System.out.println("Cleaning up resources...");
                }
                break;

            case FINISH:
                System.out.println("Finalizing...");
                break;
        }
    }
}
