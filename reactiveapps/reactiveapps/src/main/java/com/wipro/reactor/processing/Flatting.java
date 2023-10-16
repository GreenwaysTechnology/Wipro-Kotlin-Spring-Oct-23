package com.wipro.reactor.processing;

import reactor.core.publisher.Flux;

public class Flatting {
    public static void main(String[] args) {
        Flux<String> stream1 = Flux.just("Hello", "Hi", "How are you", "What about you");
        stream1.map(item -> item).log().subscribe();

        stream1.flatMap(item -> {
            return Flux.just(item + "World");
        }).log().subscribe(System.out::println);
    }
}
