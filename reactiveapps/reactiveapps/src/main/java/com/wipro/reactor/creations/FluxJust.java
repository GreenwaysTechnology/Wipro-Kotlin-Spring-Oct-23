package com.wipro.reactor.creations;

import reactor.core.publisher.Flux;

public class FluxJust {
    public static void main(String[] args) {
        Flux.just(1, 2, 3, 4, 5, 6).subscribe(integer -> {
            System.out.println(integer);
        });
        Flux.just("subramanian","murugan","karthik").subscribe(name -> {
            System.out.println(name);
        });
    }
}
