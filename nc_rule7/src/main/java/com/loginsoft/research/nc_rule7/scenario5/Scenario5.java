package com.loginsoft.research.nc_rule7.scenario5;

public class Scenario5 {

    enum State {
        IDLE, PROCESSING, DONE
    }

    public void runSimulation() {
        State currentState = State.IDLE;
        int tick = 0;

        while (tick < 5) { // Depth 1
            System.out.println("Tick: " + tick);

            if (currentState == State.IDLE) { // Depth 2
                String event = "start";

                switch (event) { // Depth 3
                    case "start":
                        if (tick % 2 == 0) { // Depth 4 ❌
                            System.out.println("Transitioning to PROCESSING");
                            currentState = State.PROCESSING;
                        }
                        break;
                    default:
                        System.out.println("No transition");
                }
            } else if (currentState == State.PROCESSING) {
                System.out.println("Processing...");
                currentState = State.DONE;
            } else {
                System.out.println("Finished.");
            }

            tick++;
        }
    }
}
