package com.reba.something.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.UUID.randomUUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TravelResTO {

    public TravelResTO(final String... places) {
        this.token = randomUUID().toString();
        this.places = newArrayList(places);
    }

    private String token;
    private List<String> places;

}