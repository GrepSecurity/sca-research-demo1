package com.loginsoft.research.nc_rule3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Rule3NonLambdaTests {

    private FileProcessor fileProcessor;

    @BeforeEach
    public void setup() {
        fileProcessor = new FileProcessor();
    }

    @Test
    public void testMultipleCallsOutsideAssertThrows_NonCompliant() {
        System.out.println("[JUnit] Running NON-COMPLIANT test: testMultipleCallsOutsideAssertThrows_NonCompliant");

        String invalidFile1 = Paths.get(System.getProperty("java.io.tmpdir"), "not_exist_" + UUID.randomUUID() + ".txt").toString();
        String invalidFile2 = Paths.get(System.getProperty("java.io.tmpdir"), "not_exist_" + UUID.randomUUID() + ".txt").toString();

        assertThrows(IOException.class, () -> {
            fileProcessor.readFile(invalidFile1);
            fileProcessor.readFile(invalidFile2);
        });
    }

    @Test
    public void testReadFile1_Compliant() {
        System.out.println("[JUnit] Running COMPLIANT test: testReadFile1_Compliant");

        String invalidFile = Paths.get(System.getProperty("java.io.tmpdir"), "not_exist_" + UUID.randomUUID() + ".txt").toString();

        assertThrows(IOException.class, () -> {
            fileProcessor.readFile(invalidFile);
        });
    }

    @Test
    public void testReadFile2_Compliant() {
        System.out.println("[JUnit] Running COMPLIANT test: testReadFile2_Compliant");

        String invalidFile = Paths.get(System.getProperty("java.io.tmpdir"), "not_exist_" + UUID.randomUUID() + ".txt").toString();

        assertThrows(IOException.class, () -> {
            fileProcessor.readFile(invalidFile);
        });
    }

    @Test
    public void testMultipleCallsInTry_NonCompliant() {
        System.out.println("[JUnit] Running NON-COMPLIANT test: testMultipleCallsInTry_NonCompliant");

        String invalidFile1 = Paths.get(System.getProperty("java.io.tmpdir"), "not_exist_" + UUID.randomUUID() + ".txt").toString();
        String invalidFile2 = Paths.get(System.getProperty("java.io.tmpdir"), "not_exist_" + UUID.randomUUID() + ".txt").toString();

        assertThrows(IOException.class, () -> {
            try {
                fileProcessor.readFile(invalidFile1);
                fileProcessor.readFile(invalidFile2);
            } catch (IOException e) {
                throw e;
            }
        });
    }

    @Test
    public void testSingleCallOnly_Compliant() {
        System.out.println("[JUnit] Running COMPLIANT test: testSingleCallOnly_Compliant");

        String invalidFile = Paths.get(System.getProperty("java.io.tmpdir"), "not_exist_" + UUID.randomUUID() + ".txt").toString();

        assertThrows(IOException.class, () -> {
            fileProcessor.readFile(invalidFile);
        });
    }
}
