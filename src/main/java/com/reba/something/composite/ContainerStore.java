package com.reba.something.composite;

import com.reba.something.composite.pojo.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static com.google.common.collect.Lists.newArrayList;

@Service
public class ContainerStore {

    public Valuable findByToken(final String token) {
        final Valuable hat = new Hat(new BigDecimal("80"));
        final Valuable phone = new Phone(new BigDecimal("12000"));

        final Valuable box = new Box(newArrayList(hat, phone));
        final Valuable pencil1 = new Pencil(new BigDecimal("70"));
        final Valuable pencil2 = new Pencil(new BigDecimal("100"));

        return new Box(newArrayList(box, pencil1, pencil2));
    }

}