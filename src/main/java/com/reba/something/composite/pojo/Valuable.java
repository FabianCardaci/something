package com.reba.something.composite.pojo;

import java.math.BigDecimal;

public interface Valuable {

    BigDecimal calculateAmount(Box father);

}