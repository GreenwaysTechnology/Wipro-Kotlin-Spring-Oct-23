package com.wipro.reactor.errorhandling;

import reactor.core.publisher.Flux;

public class Retry {
    private static String doSomething(int i) {
        System.out.println("Calling with " + i);
        if (i == 5) {
            throw new RuntimeException("sorry");
        }
        return Integer.toString(i);
    }

    public static void main(String[] args) {
        Flux.range(1, 10)
                .map(v -> doSomething(v))
                .retry(3)
                .onErrorReturn("RECOVERED")
                .subscribe(v -> System.out.println(v), err -> System.out.println(err));
    }
}
