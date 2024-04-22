package com.example.flightsample;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Basket {

    private UUID basketId;

    private TicketPriceDetail ticketPriceDetail;

    private List<AdditionalClass> additionalClasses;
}
