package com.loginsoft.research.nc_rule4.scenario5;

import reactor.core.publisher.Mono;

public class Compliant5 {
    public void run() {
        System.out.println("[Compliant5] Invoked - using non-blocking reactive flow");

        Mono<String> message = Mono.just("Reactive World");

        message.subscribe(result -> System.out.println("[Compliant5] Got result asynchronously: " + result));
    }
}
