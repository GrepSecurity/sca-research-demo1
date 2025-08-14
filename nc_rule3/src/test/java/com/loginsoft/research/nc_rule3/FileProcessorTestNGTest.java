package com.loginsoft.research.nc_rule3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileProcessorTestNGTest {

    private final FileProcessor processor = new FileProcessor();

    @Test
    public void testProcessFileNonCompliant_TestNG() {
        System.out.println("[TestNG] Running NON-COMPLIANT test: testProcessFileNonCompliant_TestNG");
        try {
            processor.processFile("invalid_input.txt", "invalid_output.txt");
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException e) {
            System.out.println("[TestNG] Caught expected exception: " + e.getMessage());
        }
    }

    @Test
    public void testProcessFileCompliant_TestNG() {
        System.out.println("[TestNG] Running COMPLIANT test: testProcessFileCompliant_TestNG");
        try {
            processor.readFile("invalid_input.txt");
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException e) {
            System.out.println("[TestNG] Caught expected exception from readFile: " + e.getMessage());
        }
    }
}
