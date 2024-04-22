package com.example.flightsample;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RedisService {

    void writeFlightBasketInformation(UUID basketId){

    }

    Basket readFlightBasketInformation(UUID basketId){
        return new Basket();
    }
}
