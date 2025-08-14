package com.loginsoft.research.nc_rule8.scenario1;

import org.springframework.stereotype.Component;

@Component
public class NonCompliantScenario1 {

    public enum JobStatus {
        PENDING, IN_PROGRESS, FAILED
    }

    public void execute() {
        JobStatus status = JobStatus.IN_PROGRESS;
        int attempts = 0;

        switch (status) {
            case PENDING:
                System.out.println("Job is pending...");
                break;

            case IN_PROGRESS:
                retry: for (int i = 0; i < 3; i++) {  // ❌ Labelled loop inside switch
                    System.out.println("Attempt #" + (i + 1));
                    attempts++;

                    if (attempts == 2) {
                        System.out.println("Breaking retry label");
                        break retry;  // Breaks the loop, but not clearly associated with switch
                    }
                }
                System.out.println("Finished processing IN_PROGRESS job");
                break;

            case FAILED:
                System.out.println("Job has failed.");
                break;
        }
    }
}
