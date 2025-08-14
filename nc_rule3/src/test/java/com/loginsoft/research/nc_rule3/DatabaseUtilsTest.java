package com.loginsoft.research.nc_rule3;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DatabaseUtilsTest {

    DatabaseUtils dbUtils = new DatabaseUtils();

    @Test
    public void testConnectAndExecute_NonCompliant() {
        System.out.println("[JUnit] Running NON-COMPLIANT test: testConnectAndExecute_NonCompliant");
        assertThrows(SQLException.class, () -> dbUtils.connectAndExecute("jdbc:mysql://invalid", "SELECT 1"));
    }

    @Test
    public void testConnectAndExecute_Compliant() throws SQLException {
        System.out.println("[JUnit] Running COMPLIANT test: testConnectAndExecute_Compliant");
        assertThrows(SQLException.class, () -> dbUtils.connect("jdbc:mysql://invalid"));
    }
}
