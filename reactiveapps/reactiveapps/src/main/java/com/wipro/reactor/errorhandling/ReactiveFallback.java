package com.wipro.reactor.errorhandling;

import reactor.core.publisher.Flux;

public class ReactiveFallback {
    private static String doSomething(int i) {
        // System.out.println(i);
        if (i == 5) {
            throw new RuntimeException("sorry");
        }
        return Integer.toString(i);
    }

    public static void main(String[] args) {
        Flux.range(1, 10)
                .map(v -> doSomething(v))

                .onErrorReturn("RECOVERED")
//                .onErrorReturn(e -> e.getMessage().equals("boom10"), "recovered10")
                .subscribe(v -> System.out.println(v), err -> System.out.println(err));

    }
}
