package com.loginsoft.research.nc_rule7.scenario3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Scenario3 {

    public void readFileAndProcess(String filePath) {
        try { // Depth 1
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            try { // Depth 2
                String line;
                while ((line = reader.readLine()) != null) { // Depth 3
                    if (!line.trim().isEmpty()) { // Depth 4 ❌
                        for (String word : line.split(" ")) { // Depth 5
                            if (word.length() > 3) {
                                System.out.println("Word: " + word);
                            }
                        }
                    }
                }
            } finally {
                reader.close();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + filePath);
        }
    }
}
