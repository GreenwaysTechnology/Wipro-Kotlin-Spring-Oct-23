package com.wipro.reactor.processing;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class FlatMapCoimbined {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");
        Flux<String> fewWords = Flux.just("Hello", "World");
        Flux<String> manyWords = Flux.fromIterable(words);
        //complex biz logic with declarative approach.
        Flux<String> manyLetters = Flux
                .fromIterable(words)
                .log()
                .flatMap(word -> Flux.just(word))
                .log()
                .distinct()
                .log()
                .sort()
                .log()
                .zipWith(Flux.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string));

        manyLetters.log().subscribe(System.out::println);
    }
}
