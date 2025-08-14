package com.loginsoft.research.nc_rule5.scenario4;

import java.util.HashMap;
import java.util.Map;

public class NonCompliantThymeleafAccess {

    public void runScenario() {
        System.out.println("[NonCompliantThymeleafAccess] Starting scenario...");

        Map<String, Object> model = buildModel();
        System.out.println("[NonCompliantThymeleafAccess] Model contents: " + model);

        try {
            Integer age = (Integer) model.get("age"); // Unsafe cast
            System.out.println("[NonCompliantThymeleafAccess] Retrieved age: " + age);
        } catch (ClassCastException ex) {
            System.err.println("[NonCompliantThymeleafAccess] ClassCastException: " + ex.getMessage());
        }

        System.out.println("[NonCompliantThymeleafAccess] Scenario finished.\n");
    }

    private Map<String, Object> buildModel() {
        Map<String, Object> model = new HashMap<>();
        model.put("name", "Alice");
        model.put("age", "25"); // Stored as String intentionally
        return model;
    }
}
