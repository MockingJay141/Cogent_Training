package com.reactiveProgramming;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

public class ReactiveSources {

    public static Flux<String> stringNumbersFlux(){
        return Flux.just("one", "two", "Three", "four", "five", "six", "Seven", "eight", "nine", "ten").
                delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intNumbersFlux(){
        return Flux.range(1, 10).delayElements(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intNumberFluxWithException() {
        return Flux.range(1, 10).delayElements(Duration.ofSeconds(1)).
                map(e -> {
                    if (e == 5 ) throw new RuntimeException("An Error has happened in Flux");
                    return e;
                });
    }

    public static Mono<Integer> intNumberMono() {
        return Mono.just(42).delayElement(Duration.ofSeconds(1));
    }

    public static Flux<User> userFlux() {
        return Flux.just(new User(1, "Lionel", "Messi"),
                new User(2, "Cristiano", "Ronaldo"),
                new User(3, "Diego", "Maradona"),
                new User(4, "Zinedine", "Zidane"),
                new User(5, "Gareth", "Bale"),
                new User(1, "Jorgen", "Klinsmann")).
                delayElements(Duration.ofSeconds(1));
    }

    public static Mono<User> userMono() {
        return Mono.just(new User(1, "Lionel", "Messi")).
                delayElement(Duration.ofSeconds(1));
    }

    public static Flux<String> unresponsiveFlux() {
        return Flux.never();
    }

    public static Mono<String> unresponsiveMono() {
        return Mono.never();
    }

    public static Flux<Integer> intNumbersFluxWithRepeat(){
        return Flux.just(1, 1, 3, 5, 3, 4, 5, 3, 5).
                delayElements(Duration.ofSeconds(1));
    }

}
