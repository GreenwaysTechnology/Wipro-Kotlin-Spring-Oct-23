package com.wipro.reactor.creations;

import reactor.core.publisher.Mono;

import java.time.Duration;

public class MonoWithDelay {
    public static void main(String[] args) {
        Mono.just("Hello, I am delayed")
                .delayElement(Duration.ofSeconds(2))
                .doOnSuccess(System.out::println)
                .log()
                .block(); //block this thread until result is available.

    }
}
