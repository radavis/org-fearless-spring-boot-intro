package org.fearless.springbootintro.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleGreetingServiceTests {

    @Test
    public void testGreeting() {
        SimpleGreetingService greetingService = new SimpleGreetingService();
        String message = greetingService.greet("Bob");
        assertEquals(message, "Hello, Bob!");
    }
}
