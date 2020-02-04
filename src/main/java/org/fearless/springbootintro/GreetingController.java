package org.fearless.springbootintro;

import org.fearless.springbootintro.hello.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet") // HTTP requests for `GET /greet` are mapped to this method
    @ResponseBody // the return value of this method becomes the HTTP response body
    public String greet(@RequestParam String name) {
        return greetingService.greet(name);
    }
}
