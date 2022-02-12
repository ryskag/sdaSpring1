package com.example.sdaSpring1;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class DummyLogger {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello from task1";
    }

}