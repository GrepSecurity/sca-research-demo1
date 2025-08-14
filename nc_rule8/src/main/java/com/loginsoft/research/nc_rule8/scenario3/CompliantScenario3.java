package com.loginsoft.research.nc_rule8.scenario3;

import org.springframework.stereotype.Component;

@Component
public class CompliantScenario3 {

    public enum OperationStatus {
        SUCCESS, FAILED, TIMEOUT
    }

    public void execute() {
        OperationStatus status = OperationStatus.FAILED;

        switch (status) {
            case SUCCESS:
                System.out.println("Operation completed successfully.");
                break;

            case FAILED:
                handleFailure();
                System.out.println("Continuing with post-failure logic.");
                break;

            case TIMEOUT:
                System.out.println("Operation timed out.");
                break;
        }
    }

    private void handleFailure() {
        boolean needsRestart = true;

        System.out.println("Operation failed. Entering recovery block.");
        if (needsRestart) {
            System.out.println("Restarting system...");
            return; // ✅ Explicit and readable control flow
        }

        System.out.println("No restart needed.");
    }
}
