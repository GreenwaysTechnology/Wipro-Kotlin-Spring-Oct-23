package com.wipro.reactor.processing;

import reactor.core.publisher.Flux;

public class Filter {
    public static void main(String[] args) {
        Flux.range(1, 10).filter(i -> i % 2 == 0).log().subscribe();
    }
}
