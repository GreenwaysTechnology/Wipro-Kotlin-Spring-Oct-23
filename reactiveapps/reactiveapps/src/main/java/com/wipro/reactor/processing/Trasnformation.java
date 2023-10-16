package com.wipro.reactor.processing;

import reactor.core.publisher.Flux;

import java.util.function.Function;

public class Trasnformation {
    public static void main(String[] args) {
        //Flux.range(1, 10).map(i -> i * 2).log().subscribe();
        Function<Integer, Integer> multiplyByTen = (x) -> x * 10;
        Flux.range(1, 10).map(multiplyByTen).log().subscribe();
    }
}
