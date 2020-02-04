package org.fearless.springbootintro.hello;

import org.fearless.springbootintro.hello.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // or @Qualifier
@Service // or @Component
public class SimpleGreetingService implements GreetingService {

    @Override
    public String greet(String name) {
        return String.format("Hello, %s!", name);
    }
}
