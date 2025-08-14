package com.loginsoft.research.nc_rule8.scenario1;

import org.springframework.stereotype.Component;

@Component
public class CompliantScenario1 {

    public enum JobStatus {
        PENDING, IN_PROGRESS, FAILED
    }

    public void execute() {
        JobStatus status = JobStatus.IN_PROGRESS;

        switch (status) {
            case PENDING:
                System.out.println("Job is pending...");
                break;

            case IN_PROGRESS:
                handleInProgress();  // ✅ extracted logic, no label pollution inside switch
                break;

            case FAILED:
                System.out.println("Job has failed.");
                break;
        }
    }

    private void handleInProgress() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Compliant Attempt #" + (i + 1));
            if (i == 1) {
                System.out.println("Breaking out of loop (compliant)");
                break;
            }
        }
        System.out.println("Finished processing IN_PROGRESS job");
    }
}
