package com.reba.something.composite.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import static java.util.Objects.nonNull;
import static org.apache.commons.collections4.CollectionUtils.size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hat implements Valuable {

    private static final BigDecimal DISCOUNT_AMOUNT = new BigDecimal("20");

    private BigDecimal amount;

    @Override
    public BigDecimal calculateAmount(final Box father) {
        final int numOfProducts = nonNull(father) ? size(father.getValuables()) : 0;
        if (numOfProducts > 5) {
            return amount.subtract(DISCOUNT_AMOUNT);
        } else {
            return amount;
        }
    }

}