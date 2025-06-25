package com.gmp.boot;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class SampleController {

    private final MeterRegistry registry;

    SampleController(MeterRegistry registry) {
        this.registry = registry;
    }

    @GetMapping("/hello")
    public String hello() {
        registry.counter("custom.hello.count", "status", "ok").increment();
        return "Hello, world!";
    }
}
