package com.reba.something.composite.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Valuable {

    private BigDecimal amount;

    @Override
    public BigDecimal calculateAmount(final Box father) {
        return amount;
    }

}