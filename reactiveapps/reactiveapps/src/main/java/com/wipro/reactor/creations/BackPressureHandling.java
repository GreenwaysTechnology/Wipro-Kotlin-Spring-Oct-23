package com.wipro.reactor.creations;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

public class BackPressureHandling {
    public static void main(String[] args) {
        Flux.range(1, 1000).subscribe(
                new Subscriber<Integer>() {
                    @Override
                    public void onSubscribe(Subscription subscription) {
                        //backpressure code
                        subscription.request(3);
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println(integer);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println(throwable.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Completed");
                    }
                }
        );
    }
}
