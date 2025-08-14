package com.loginsoft.research.nc_rule3;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileProcessorTest {

    private final FileProcessor processor = new FileProcessor();

    @Test
    public void testProcessFileNonCompliant_JUnit() {
        System.out.println("[JUnit] Running NON-COMPLIANT test: testProcessFileNonCompliant_JUnit");
        assertThrows(IOException.class, () -> processor.processFile("invalid_input.txt", "invalid_output.txt"));
    }

    @Test
    public void testProcessFileCompliant_JUnit() {
        System.out.println("[JUnit] Running COMPLIANT test: testProcessFileCompliant_JUnit");
        assertThrows(IOException.class, () -> {
            String content = processor.readFile("invalid_input.txt");
        });
    }

    @Test
    public void testProcessFileValid() throws IOException {
        System.out.println("[JUnit] Running VALID test: testProcessFileValid");

        Path tempInput = Files.createTempFile("test-input", ".txt");
        Path tempOutput = Files.createTempFile("test-output", ".txt");

        Files.writeString(tempInput, "hello");

        String result = processor.processFile(tempInput.toString(), tempOutput.toString());
        String written = Files.readString(tempOutput);

        System.out.println("Processed content: " + result);
        System.out.println("Written content: " + written);

        Files.deleteIfExists(tempInput);
        Files.deleteIfExists(tempOutput);
    }
}
