package com.loginsoft.research.nc_rule7.scenario2;

public class Scenario2 {

    public void processCommand(String command) {
        switch (command) { // Depth 1
            case "START":
                System.out.println("Received START command");

                boolean systemReady = true;
                if (systemReady) { // Depth 2
                    System.out.println("System is ready");

                    int retries = 0;
                    while (retries < 3) { // Depth 3
                        System.out.println("Attempt " + (retries + 1));

                        if (Math.random() > 0.5) { // Depth 4 ❌
                            System.out.println("Command executed successfully");
                            break;
                        } else {
                            System.out.println("Temporary failure. Retrying...");
                        }
                        retries++;
                    }
                }
                break;

            case "STOP":
                System.out.println("Stopping system...");
                break;

            default:
                System.out.println("Unknown command: " + command);
        }
    }
}

