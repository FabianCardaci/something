package com.reba.something.composite.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

import static java.math.BigDecimal.ZERO;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Box implements Valuable {

    private List<Valuable> valuables;

    @Override
    public BigDecimal calculateAmount(final Box father) {
        return valuables.stream().map(it -> it.calculateAmount(this)).reduce(ZERO, BigDecimal::add);
    }

}