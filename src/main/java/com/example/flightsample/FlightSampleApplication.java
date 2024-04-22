package com.example.flightsample;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class FlightSampleApplication implements CommandLineRunner {

    private final FlightPriceService flightPriceService;
    private final BasketService basketService;
    private final AdditionalService additionalService;


    public static void main(String[] args) {
        SpringApplication.run(FlightSampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        BigDecimal flightPrice = flightPriceService.calculateBasicFlightPrice(0, 10); // flight-price-service
        // create Basket request
        UUID basicBasketId = basketService.createBasicBasket(UUID.randomUUID());

        basketService.createBasket(UUID.randomUUID(), Optional.empty());
        // add additional for flight
        AdditionalClass additionalClass = additionalService.calculateAdditionalService(AdditionalType.PET, new AdditionalInfo());

        basketService.addAdditionalService(UUID.randomUUID(), additionalClass);
        // redis basket ilgili bilgileri yazmasi gerek

    }
}
