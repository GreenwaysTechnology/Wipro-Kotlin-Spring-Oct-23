package com.wipro.reactor.creations;

import reactor.core.publisher.Mono;

public class MonoCreateOperator {
    public static void main(String[] args) {
        Mono<String> single = Mono.create(monoSink -> {
            monoSink.success("Hello");
        });
        single.subscribe(data -> {
            System.out.println("data " + data);
        }, err -> System.out.println("Errror " + err.getMessage()));

        //Mono Creation operators
        Mono.just("How are you?").log().subscribe();
        //no value
        Mono.empty().log().subscribe();

        Mono.error(new RuntimeException("something went wrong")).log().subscribe();


    }
}
