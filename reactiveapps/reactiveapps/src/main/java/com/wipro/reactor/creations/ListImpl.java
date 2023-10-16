package com.wipro.reactor.creations;

import reactor.core.publisher.Flux;

import java.util.List;

public class ListImpl {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        Flux.fromIterable(integerList).subscribe(item -> {
            System.out.println(item);
        });

        Integer[] data = {1, 2, 3, 4, 5};
        Flux<Integer> producerArray = Flux.fromArray(data);
        producerArray.subscribe(integer -> {
            System.out.println(integer);
        });

        //sequence of numbers from start to end : range
        Flux<Integer> rangeProducer = Flux.range(1, 100);
        rangeProducer.subscribe(r -> {
            System.out.println(r);
        });
    }
}
