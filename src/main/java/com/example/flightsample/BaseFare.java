package com.example.flightsample;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BaseFare {

    private String currencyCode;
    private BigDecimal amount;
}
