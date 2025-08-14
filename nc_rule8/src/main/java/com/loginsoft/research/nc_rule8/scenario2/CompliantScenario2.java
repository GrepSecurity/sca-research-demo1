package com.loginsoft.research.nc_rule8.scenario2;

import org.springframework.stereotype.Component;

@Component
public class CompliantScenario2 {

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
                handleProcess();  // ✅ Extracted logic avoids label misuse
                break;

            case FINISH:
                System.out.println("Finalizing...");
                break;
        }
    }

    private void handleProcess() {
        System.out.println("Preparing data...");
        System.out.println("Executing core logic...");
        System.out.println("Cleaning up resources...");
    }
}
