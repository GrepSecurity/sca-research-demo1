package com.loginsoft.research.nc_rule3;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class BufferedReaderProcessorTest {

    BufferedReaderProcessor processor = new BufferedReaderProcessor();

    @Test
    public void testReadFile_NonCompliant() {
        System.out.println("[JUnit] Running NON-COMPLIANT test: testReadFile_NonCompliant");
        assertThrows(IOException.class, () -> processor.readFile("invalid_input.txt"));
    }

    @Test
    public void testReadFile_Compliant() throws IOException {
        System.out.println("[JUnit] Running COMPLIANT test: testReadFile_Compliant");

        // Create a temporary file with dummy content
        Path tempFile = Files.createTempFile("test-compliant-bufferedreader-", ".txt");
        Files.writeString(tempFile, "line1\nline2");

        assertDoesNotThrow(() -> processor.readFileSafeClose(tempFile.toString()));
    }
}
