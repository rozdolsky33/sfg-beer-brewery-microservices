package com.arwest.msscbrewery.services;

import com.arwest.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    BeerDto saveNewBeer(BeerDto beerDto);
    void updateBeer(String beerId, BeerDto beerDto);
    void deleteById(UUID beerId);
}

