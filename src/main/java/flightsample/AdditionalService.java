package com.example.flightsample;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdditionalService {

    public AdditionalClass calculateAdditionalService(AdditionalType additionalType, AdditionalInfo additionalInfo){
        return new AdditionalClass();
    }
}
