package com.reba.something.controller;

import com.reba.something.pojo.TravelReqTO;
import com.reba.something.pojo.TravelResTO;
import com.reba.something.service.TouristService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/v1/travels/tourists")
public class TouristController {

    @Autowired
    private TouristService service;


    @PostMapping("/procedural")
    public TravelResTO proceduralTravel(
            @RequestBody final TravelReqTO request
    ) {
        log.info("Request to create a student travel to '{}'", request.getCountry());
        final TravelResTO response = service.proceduralTravel(request);
        log.info("Response to create a student travel to '{}' OK. Token '{}'", request.getCountry(), response.getToken());
        return response;
    }

    @PostMapping("/strategy")
    public TravelResTO strategyTravel(
            @RequestBody final TravelReqTO request
    ) {
        log.info("Request to create a student travel to '{}'", request.getCountry());
        final TravelResTO response = service.strategyTravel(request);
        log.info("Response to create a student travel to '{}' OK. Token '{}'", request.getCountry(), response.getToken());
        return response;
    }

    @PostMapping("/visitor")
    public TravelResTO visitorTravel(
            @RequestBody final TravelReqTO request
    ) {
        log.info("Request to create a student travel to '{}'", request.getCountry());
        final TravelResTO response = service.visitorTravel(request);
        log.info("Response to create a student travel to '{}' OK. Token '{}'", request.getCountry(), response.getToken());
        return response;
    }

}