package com.wipro.reactor.schedulers;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class PublishOnOperator {
    public static void main(String[] args) {
        Scheduler s = Schedulers.newParallel("parallel-scheduler", 5);
        Flux<Integer> flux = Flux.range(1, 5)
                .map(i -> {
                    System.out.println("First Map -> " + Thread.currentThread().getName() + " " + i);
                    return i * 10;
                })
                .publishOn(s) //downstream only take this thread
                .map(i -> {
                    System.out.println("Second Map -> " + Thread.currentThread().getName());
                    return i + 2;
                });
        flux.subscribe(System.out::println);
    }
}
