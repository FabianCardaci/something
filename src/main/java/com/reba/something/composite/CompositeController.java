package com.reba.something.composite;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Slf4j
@RestController
@RequestMapping(value = "/v1/containers")
public class CompositeController {

    @Autowired
    private CompositeService service;


    @GetMapping("/{token}/amounts")
    public BigDecimal proceduralTravel(
            @PathVariable final String token
    ) {
        log.info("Request to calculate the amount of container with token '{}'", token);
        final BigDecimal amount = service.containerAmount(token);
        log.info("Response to calculate the amount of container with token '{}' OK. Amount: '{}'", token, amount);
        return amount;
    }

}