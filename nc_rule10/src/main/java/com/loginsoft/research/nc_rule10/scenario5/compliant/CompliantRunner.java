package com.loginsoft.research.nc_rule10.scenario5.compliant;

import com.loginsoft.research.nc_rule10.scenario5.SocketHandler;

public class CompliantRunner {
    public static void run() {
        System.out.println("==== Compliant Scenario 5 ====");
        SocketHandler handler = new SocketHandler();
        System.out.println("Connection: " + handler.openConnection());
        System.out.println("Send: " + handler.sendMessage());
    }
}