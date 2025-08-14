package com.loginsoft.research.nc_rule3;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SocketHandlerTest {

    @Test
    public void testSendData_NonCompliant() {
        System.out.println("[JUnit] Running NON-COMPLIANT test: testSendData_NonCompliant");
        SocketHandler handler = new SocketHandler();
        assertThrows(IOException.class, () -> handler.sendData("localhost", 9999, "ping"));
    }

    @Test
    public void testSendData_Compliant() {
        System.out.println("[JUnit] Running COMPLIANT test: testSendData_Compliant");
        SocketHandler handler = new SocketHandler();
        try {
            handler.sendDataWithSafeFinally("localhost", 9999, "ping");
        } catch (IOException e) {
            System.out.println("[COMPLIANT] Exception caught gracefully: " + e.getMessage());
        }
    }
}
