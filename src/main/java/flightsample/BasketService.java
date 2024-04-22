package com.example.flightsample;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BasketService {

    private final RedisService redisService;

    public void createBasket(UUID basketId, Optional<TicketPriceDetail> ticketPriceDetail) {
        if (ticketPriceDetail.isEmpty()) {
            //
        }
        //
    }

    public UUID createBasicBasket(UUID basketId) {

        redisService.writeFlightBasketInformation(UUID.randomUUID());
        return UUID.randomUUID();
    }

    public void addAdditionalService(UUID basketId, AdditionalClass additionalClass) {
        // user -> user -> basket id -> user icerdeki kullanici -> basket id
        // guest -> web sayfasi SESSIONID -> basket id ->
        Basket basket = redisService.readFlightBasketInformation(basketId);
        basket.getAdditionalClasses().add(additionalClass);
        redisService.writeFlightBasketInformation(basketId);
    }

    public void removeAdditionalServiceWithAdditionalId(UUID basketId, UUID removeAdditionalId){
        Basket basket = redisService.readFlightBasketInformation(basketId);
        List<AdditionalClass> additionalClasses = basket.getAdditionalClasses();
//        additionalClasses.stream()
//                .filter(additionalClass -> additionalClass.getBaseAdditionalField().getAdditionalId().equals(removeAdditionalId))
//                .remove();
        redisService.writeFlightBasketInformation(basketId);
    }

    public void removeAdditionalServiceWithType(UUID basketId, AdditionalType additionalType){
        Basket basket = redisService.readFlightBasketInformation(basketId);
        List<AdditionalClass> additionalClasses = basket.getAdditionalClasses();
//        additionalClasses.stream()
//                .filter(additionalClass -> additionalClass.getBaseAdditionalField().getAdditionalType() == additionalType).remove();
        redisService.writeFlightBasketInformation(basketId);
    }


}
