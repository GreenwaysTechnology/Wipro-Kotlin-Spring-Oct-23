package com.wipro.reactor.errorhandling;

import reactor.core.publisher.Flux;

public class ReactiveErrorHandling {
    private static String doSomething(int i) {
        // System.out.println(i);
        if (i == 5) {
            throw new RuntimeException("something went wrong!!!");
        }
        return Integer.toString(i);
    }

    public static void main(String[] args) {
        Flux<String> f = Flux.range(1, 10)
                .map(v -> doSomething(v));

        f.subscribe(v -> System.out.println(v),
                err -> System.out.println("CAUGHT" + err.getMessage()));
    }
}
