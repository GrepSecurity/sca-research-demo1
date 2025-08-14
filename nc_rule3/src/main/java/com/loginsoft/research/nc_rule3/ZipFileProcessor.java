package com.loginsoft.research.nc_rule3;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.Enumeration;

public class ZipFileProcessor {

    // ❌ NON-COMPLIANT: Throws exception in finally block
    public void processZip(String zipPath) throws IOException {
        ZipFile zipFile = null;
        try {
            zipFile = new ZipFile(zipPath);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                System.out.println("NON-COMPLIANT: Found file: " + entry.getName());
            }
        } finally {
            // This can throw IOException and potentially mask earlier exceptions
            if (zipFile != null) {
                zipFile.close(); // ❌ Unsafe: can throw
            }
        }
    }

    // ✅ COMPLIANT: Handles exception safely in finally block
    public void processZipSafe(String zipPath) throws IOException {
        ZipFile zipFile = null;
        try {
            zipFile = new ZipFile(zipPath);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                System.out.println("COMPLIANT: Found file: " + entry.getName());
            }
        } catch (IOException e) {
            throw e;
        } finally {
            if (zipFile != null) {
                try {
                    zipFile.close(); // ✅ Handled with catch
                } catch (IOException e) {
                    System.err.println("Warning: Failed to close zip: " + e.getMessage());
                }
            }
        }
    }
}
