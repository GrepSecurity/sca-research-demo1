package com.loginsoft.research.nc_rule4.scenario4;

import java.util.stream.Stream;

public class NonCompliant4 {
    public void run() {
        System.out.println("[NonCompliant4] Invoked - reusing a stream after terminal operation");

        Stream<String> names = Stream.of("alice", "bob", "carol");

        names.forEach(name -> System.out.println("[NonCompliant4] Hello, " + name));
        System.out.println("[NonCompliant4] First terminal op complete");

        // 🚨 Reusing stream after it's already been consumed
        names.map(String::toUpperCase)
                .forEach(name -> System.out.println("[NonCompliant4] Upper: " + name));
    }
}
