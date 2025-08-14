package com.loginsoft.research.nc_rule3;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static org.junit.jupiter.api.Assertions.*;

public class ZipFileProcessorTest {

    ZipFileProcessor processor = new ZipFileProcessor();

    @Test
    public void testProcessZip_NonCompliant() {
        System.out.println("[JUnit] Running NON-COMPLIANT test: testProcessZip_NonCompliant");
        assertThrows(IOException.class, () -> processor.processZip("non_existent.zip"));
    }

    @Test
    public void testProcessZip_Compliant() throws IOException {
        System.out.println("[JUnit] Running COMPLIANT test: testProcessZip_Compliant");

        // Create a temporary zip file with one entry
        Path tempZip = Files.createTempFile("test-compliant-zip-", ".zip");

        try (ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(tempZip))) {
            ZipEntry entry = new ZipEntry("test.txt");
            zos.putNextEntry(entry);
            zos.write("hello zip".getBytes());
            zos.closeEntry();
        }

        assertDoesNotThrow(() -> processor.processZipSafe(tempZip.toString()));
    }
}
