package com.loginsoft.research.nc_rule8.scenario4;

import org.springframework.stereotype.Component;

@Component
public class CompliantScenario4 {

    public enum HttpStatusCode {
        OK, NOT_FOUND, INTERNAL_ERROR
    }

    public void execute() {
        HttpStatusCode code = HttpStatusCode.INTERNAL_ERROR;

        switch (code) {
            case OK:
                System.out.println("200 OK");
                break;

            case NOT_FOUND:
                System.out.println("404 Not Found");
                break;

            default:
                handleFallback();
                break;
        }
    }

    private void handleFallback() {
        System.out.println("An unknown error occurred.");
        System.out.println("Triggering fallback mechanism.");
        System.out.println("Fallback complete.");
    }
}
