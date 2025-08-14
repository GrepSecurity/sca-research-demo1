package com.loginsoft.research.nc_rule7.scenario1;


import java.util.Arrays;
import java.util.List;

public class Scenario1 {

    public void processUsers() {
        List<String> users = Arrays.asList("alice", "bob", "charlie");

        if (users != null) { // Depth 1
            System.out.println("Users list is not null");

            for (String user : users) { // Depth 2
                System.out.println("Processing user: " + user);

                if (user != null && !user.isEmpty()) { // Depth 3
                    System.out.println("User is valid");

                    try { // Depth 4 ❌
                        if (user.startsWith("a")) { // Depth 5
                            System.out.println("Welcome, admin-level user: " + user);
                        } else {
                            System.out.println("Standard user: " + user);
                        }
                    } catch (Exception e) {
                        System.err.println("Error processing user: " + user);
                    }
                }
            }
        }
    }
}
