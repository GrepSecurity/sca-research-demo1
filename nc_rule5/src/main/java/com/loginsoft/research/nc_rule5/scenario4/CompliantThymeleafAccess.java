package com.loginsoft.research.nc_rule5.scenario4;

import java.util.HashMap;
import java.util.Map;

public class CompliantThymeleafAccess {

    public void runScenario() {
        System.out.println("[CompliantThymeleafAccess] Starting scenario...");

        Map<String, Object> model = buildModel();
        System.out.println("[CompliantThymeleafAccess] Model contents: " + model);

        Object value = model.get("age");
        if (value instanceof Integer age) {
            System.out.println("[CompliantThymeleafAccess] Age is valid: " + age);
        } else {
            System.out.println("[CompliantThymeleafAccess] Invalid type. Expected Integer, but got: " + value);
        }

        System.out.println("[CompliantThymeleafAccess] Scenario finished.\n");
    }

    private Map<String, Object> buildModel() {
        Map<String, Object> model = new HashMap<>();
        model.put("name", "Alice");
        model.put("age", "25"); // Stored as String
        return model;
    }
}
