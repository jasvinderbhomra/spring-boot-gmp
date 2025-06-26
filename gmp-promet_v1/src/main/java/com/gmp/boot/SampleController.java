package com.gmp.boot;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class SampleController {

    private final MeterRegistry registry;

    SampleController(MeterRegistry registry) {
        this.registry = registry;
    }

    @PostMapping("/hello")
    public String hello(@RequestBody Request requestBody) {
        if (requestBody.getRequestedLowCostCarriers() != null) {
            for (String carrier : requestBody.getRequestedLowCostCarriers()) {
                registry.counter("custom.requested_low_cost_carrier_total", "carrier", carrier).increment();
            }
        }
        //registry.counter("custom.hello.count", "status", "ok").increment();
        return "Hello, world!";
    }
}
