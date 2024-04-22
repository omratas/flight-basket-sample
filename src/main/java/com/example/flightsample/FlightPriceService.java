package com.example.flightsample;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Getter
@Setter
public class FlightPriceService {

    public BigDecimal calculateBasicFlightPrice(int depart, int arrive){
        return BigDecimal.ONE;
    }

}