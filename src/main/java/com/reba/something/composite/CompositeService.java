package com.reba.something.composite;

import com.reba.something.composite.pojo.Valuable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CompositeService {

    @Autowired
    private ContainerStore containerStore;

    final BigDecimal containerAmount(final String token) {
        final Valuable container = containerStore.findByToken(token);
        return container.calculateAmount(null);
    }

}