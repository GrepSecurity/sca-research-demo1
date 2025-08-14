package com.loginsoft.research.nc_rule4.scenario5;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class NonCompliant5 {
    public void run() {
        System.out.println("[NonCompliant5] Invoked - trying to block() in a non-blocking scheduler");

        Mono.just("Reactive Rule Violation")
                .publishOn(Schedulers.parallel()) // Emulates event-loop (non-blocking)
                .doOnNext(val -> {
                    System.out.println("[NonCompliant5] Inside reactor thread, calling block()");
                    String result = Mono.just(val).block(); // 🚨 This will throw IllegalStateException
                    System.out.println("[NonCompliant5] This won't print: " + result);
                })
                .block(); // blocks the outer flow just to trigger internal violation
    }
}
