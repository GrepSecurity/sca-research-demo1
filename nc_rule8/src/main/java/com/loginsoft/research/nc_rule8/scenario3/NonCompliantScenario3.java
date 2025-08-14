package com.loginsoft.research.nc_rule8.scenario3;

import org.springframework.stereotype.Component;

@Component
public class NonCompliantScenario3 {

    public enum OperationStatus {
        SUCCESS, FAILED, TIMEOUT
    }

    public void execute() {
        OperationStatus status = OperationStatus.FAILED;
        boolean needsRestart = true;

        switch (status) {
            case SUCCESS:
                System.out.println("Operation completed successfully.");
                break;

            case FAILED:
                recovery: {  // ❌ Non-case label misused for block logic
                    System.out.println("Operation failed. Entering recovery block.");
                    if (needsRestart) {
                        System.out.println("Restarting system...");
                        break recovery;  // ❌ Unclear behavior: exits only the label block
                    }
                    System.out.println("No restart needed.");
                }
                System.out.println("Continuing with post-failure logic.");
                break;

            case TIMEOUT:
                System.out.println("Operation timed out.");
                break;
        }
    }
}
