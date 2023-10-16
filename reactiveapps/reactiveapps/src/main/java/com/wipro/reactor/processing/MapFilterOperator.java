package com.wipro.reactor.processing;

import reactor.core.publisher.Flux;

import java.util.function.Function;
import java.util.function.Predicate;

public class MapFilterOperator {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTen = (x) -> x * 3;
        Predicate<Integer> testEven = x -> x % 2 != 0;
        Flux.range(1, 10).map(multiplyByTen).filter(testEven).log().subscribe();
    }
}
