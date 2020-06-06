package com.arwest.msscbrewery.services.v2;

import com.arwest.msscbrewery.web.model.BeerDto;
import com.arwest.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.Optional;
import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 saveNewBeer(BeerDto beerDto);
    void updateBeer(String beerId, BeerDto beerDto);
    void deleteById(UUID beerId);
}
