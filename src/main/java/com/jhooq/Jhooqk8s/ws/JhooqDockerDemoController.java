package com.jhooq.Jhooqk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - It's working?!!";
    }
    @GetMapping("/hello2")
    public String hello2() {
        return "Hello - It's working22?!!";
    }
}
