package com.wipro.reactor.creations;

import reactor.core.publisher.Flux;

public class UtiltiyMethods {
    public static void main(String[] args) {

        Flux.range(1, 10).doOnSubscribe(sub -> {
            System.out.println("doOn Subscription");
        }).doOnNext(data -> {
            System.out.println("doOnNext " + data);
        }).doOnRequest(n -> {
            System.out.println(n);
        }).doOnError(err -> {
            System.out.println("doOnError " + err);
        }).doOnComplete(() -> {
            System.out.println("doOnComplete");
        }).log().subscribe();

    }
}
