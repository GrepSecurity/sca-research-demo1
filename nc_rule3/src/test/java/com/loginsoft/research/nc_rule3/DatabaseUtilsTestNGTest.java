package com.loginsoft.research.nc_rule3;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class DatabaseUtilsTestNGTest {

    private DatabaseUtils dbUtils;

    @BeforeTest
    public void setUp() {
        System.out.println("[TestNG] @BeforeTest: Initializing DatabaseUtils");
        dbUtils = new DatabaseUtils();
    }

    @Test
    public void testConnectAndExecute_NonCompliant_TestNG() {
        System.out.println("[TestNG] Running NON-COMPLIANT test");
        try {
            dbUtils.connectAndExecute("jdbc:mysql://invalid", "SELECT 1");
            Assert.fail("Expected SQLException was not thrown");
        } catch (SQLException e) {
            System.out.println("[TestNG] Caught expected exception: " + e.getMessage());
        }
    }

    @Test
    public void testConnect_Compliant_TestNG() {
        System.out.println("[TestNG] Running COMPLIANT test");
        try {
            dbUtils.connect("jdbc:mysql://invalid");
            Assert.fail("Expected SQLException was not thrown");
        } catch (SQLException e) {
            System.out.println("[TestNG] Caught expected exception from connect: " + e.getMessage());
        }
    }

    @AfterTest
    public void tearDown() {
        System.out.println("[TestNG] @AfterTest: Cleanup done.");
    }
}
