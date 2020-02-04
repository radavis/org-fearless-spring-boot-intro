package org.fearless.springbootintro;

import org.fearless.springbootintro.hello.GreetingService;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingRunner implements ApplicationRunner {

    // @Autowired // can also be delcared, here.
    // https://www.baeldung.com/spring-autowire
    private final GreetingService greetingService;

    @Autowired
    public GreetingRunner(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String greeting = greetingService.greet("Spring");
        System.out.println(greeting);
    }
}
