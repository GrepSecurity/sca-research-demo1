package com.loginsoft.research.nc_rule3;

import java.io.*;

public class BufferedReaderProcessor {

    // ❌ NON-COMPLIANT: Throws in finally block
    public void readFile(String filePath) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("NON-COMPLIANT: Read line: " + line);
            }
        } finally {
            if (reader != null) {
                reader.close(); // ❌ Can throw IOException, possibly masking original
            }
        }
    }
    // ✅ COMPLIANT: Uses try-with-resources (Java best practice)
    public void readFileSafeClose(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("COMPLIANT (try-with-resources): Read line: " + line);
            }
        }
    }


    // ✅ COMPLIANT: Wraps close() inside try-catch
    public void readFileSafe(String filePath) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("COMPLIANT: Read line: " + line);
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close(); // ✅ Safely wrapped
                } catch (IOException e) {
                    System.err.println("Warning: Failed to close BufferedReader - " + e.getMessage());
                }
            }
        }
    }
}
