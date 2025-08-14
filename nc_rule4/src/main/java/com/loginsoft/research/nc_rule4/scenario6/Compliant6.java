package com.loginsoft.research.nc_rule4.scenario6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Compliant6 {

    public void run() {
        System.out.println("[Compliant6] Invoked - reading validated CSV");

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        getClass().getClassLoader().getResourceAsStream("malformed-data.csv")
                ))) {

            Map<String, String> map = new HashMap<>();
            String line;
            reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                String key = parts[0];
                String value = parts.length > 1 ? parts[1] : null;

                if (key == null || key.trim().equals("null")) {
                    System.out.println("[Compliant6] Skipping invalid key row");
                    continue;
                }

                if (value == null || value.isBlank()) {
                    System.out.println("[Compliant6] Skipping empty value row for key: " + key);
                    continue;
                }

                map.put(key.trim(), value.trim());
            }

            System.out.println("[Compliant6] Final map: " + map);

        } catch (Exception e) {
            System.out.println("[Compliant6] Unexpected exception: " + e.getMessage());
        }
    }
}
