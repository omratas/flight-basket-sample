package com.example.flightsample;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class BaseAdditionalField {

    private UUID additionalId;

    private BigDecimal amount;

    private AdditionalType additionalType;
}
