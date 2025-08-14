package com.loginsoft.research.nc_rule4.scenario4;

import java.util.stream.Stream;

public class Compliant4 {
    public void run() {
        System.out.println("[Compliant4] Invoked - using new stream for each operation");

        Stream<String> names1 = Stream.of("alice", "bob", "carol");
        names1.forEach(name -> System.out.println("[Compliant4] Hello, " + name));
        System.out.println("[Compliant4] First terminal op complete");

        Stream<String> names2 = Stream.of("alice", "bob", "carol");
        names2.map(String::toUpperCase)
                .forEach(name -> System.out.println("[Compliant4] Upper: " + name));
    }
}
