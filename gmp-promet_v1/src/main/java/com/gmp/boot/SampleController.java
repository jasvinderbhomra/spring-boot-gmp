package com.gmp.boot;

import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
    private final MeterRegistry registry;

    SampleController(MeterRegistry registry) {
        this.registry = registry;
    }

    @PostMapping("/hello")
    public String hello(@RequestBody Request requestBody) {
        if (requestBody.getrLCC() != null) {
            for (String c : requestBody.getrLCC()) {
                registry.counter("custom.requested_lcc_total", "lcc", c).increment();
            }
        }
        //registry.counter("custom.hello.count", "status", "ok").increment();
    @GetMapping("/hello")
    public String hello() {
        try {
        // Simulate setting request context
        MDC.put("requestId", UUID.randomUUID().toString());  // Normally from header or filter
        MDC.put("userId", "jasvinder");                      // Normally from authentication

        registry.counter("custom.hello.count", "status", "ok").increment();

        logger.info("Handling /hello request");

        return "Hello, world!";
        } finally {
            MDC.clear(); // Always clear to avoid memory leaks
        }
    }
}
