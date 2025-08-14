package com.loginsoft.research.nc_rule4.scenario6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NonCompliant6 {

    public void run() throws IOException {
        System.out.println("[NonCompliant6] Invoked - reading malformed CSV");

        Map<String, String> rawMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        getClass().getClassLoader().getResourceAsStream("malformed-data.csv")
                ))) {

            String line;
            reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                String key = parts[0];
                String value = parts.length > 1 ? parts[1] : null;

                // 🚨 Triggers IllegalArgumentException
                if (key == null || key.trim().equals("null")) {
                    throw new IllegalArgumentException("Key is null or 'null' string");
                }

                // 🚨 Triggers IllegalStateException
                if (value == null || value.isBlank()) {
                    throw new IllegalStateException("Value is missing for key: " + key);
                }

                rawMap.put(key.trim(), value.trim());
            }

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("[NonCompliant6] Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }


        try {
            Map<String, String> readOnly = Collections.unmodifiableMap(rawMap);
            System.out.println("[NonCompliant6] Now trying to modify immutable map...");
            readOnly.put("another", "value"); // 🚨 IllegalStateException

        } catch (UnsupportedOperationException e) {
            System.out.println("[NonCompliant6] Caught: IllegalStateException via UnsupportedOperationException - " + e.getMessage());
        }

    }
    
}
