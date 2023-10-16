package com.wipro.reactor.creations;

import reactor.core.publisher.Flux;

public class FluxPublisherCreate {
    public static void main(String[] args) {
        //create Flux
        Flux<Integer> producer = Flux.create(fluxSink -> {
            //emit event : push item into stream(pipelien),later we attach listener to listen for data
            fluxSink.next(1); //emit event and send data
            fluxSink.next(2);
            fluxSink.next(3);
            fluxSink.next(4);
            fluxSink.complete(); //no more data...
        });
        //subscriber or caller
        //producer.log().subscribe();
        producer.subscribe(data -> System.out.println(data));
    }
}
