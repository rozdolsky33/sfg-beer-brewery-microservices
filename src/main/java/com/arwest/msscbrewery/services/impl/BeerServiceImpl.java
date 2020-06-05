package com.arwest.msscbrewery.services.impl;

import com.arwest.msscbrewery.services.BeerService;
import com.arwest.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Amsterdam")
                .beerStyle("Pale Ale").build();
    }
}
