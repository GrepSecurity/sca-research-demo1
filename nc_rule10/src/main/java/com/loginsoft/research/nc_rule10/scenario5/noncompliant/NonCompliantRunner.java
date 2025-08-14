package com.loginsoft.research.nc_rule10.scenario5.noncompliant;

import com.loginsoft.research.nc_rule10.scenario5.SocketHandler;
import static org.mockito.Mockito.*;

public class NonCompliantRunner {
    public static void run() {
        System.out.println("==== Non-Compliant Scenario 5 ====");
        SocketHandler handler = mock(SocketHandler.class); // Noncompliant
        when(handler.openConnection()).thenReturn("mockConnected");
        when(handler.sendMessage()).thenReturn("mockSent");

        System.out.println("Connection: " + handler.openConnection());
        System.out.println("Send: " + handler.sendMessage());
    }
}