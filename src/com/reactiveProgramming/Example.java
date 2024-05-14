package com.reactiveProgramming;

import jdk.jshell.JShell;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;
import java.util.concurrent.Flow;

public class Example {

    public static void main(String[] args) throws IOException {
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        System.in.read();
    }
}

class MySubscriber<T> extends BaseSubscriber<T> {
    public void hookOnSubscribe(Subscription subscription){
        System.out.println("Subscribe happened");
        request(5);
    }

    public void hookOnNext(T value) {
        System.out.println(value.toString() + ", Received");
    }
}
