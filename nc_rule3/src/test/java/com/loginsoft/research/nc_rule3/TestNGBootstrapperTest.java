package com.loginsoft.research.nc_rule3;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlTest;

import java.util.Arrays;

public class TestNGBootstrapperTest {

    @org.junit.jupiter.api.Test
    public void runTestNGSuite() {
        System.out.println("[Bootstrap] Launching TestNG suite...");

        TestNG testng = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setName("BootstrapSuite");

        XmlTest test = new XmlTest(suite);
        test.setName("TestNG-Bootstrap-Test");
        test.setXmlClasses(Arrays.asList(
                new XmlClass("com.loginsoft.research.nc_rule3.FileProcessorTestNGTest"),
                new XmlClass("com.loginsoft.research.nc_rule3.DatabaseUtilsTestNGTest")
        ));

        testng.setXmlSuites(Arrays.asList(suite));
        testng.run();

        System.out.println("[Bootstrap] TestNG execution completed.");
    }
}
