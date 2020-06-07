package com.arwest.msscbrewery.services.v2;

import com.arwest.msscbrewery.web.model.v2.BeerDtoV2;
import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 saveNewBeer(@Valid BeerDtoV2 beerDto);
    void updateBeer(String beerId, @Valid BeerDtoV2 beerDto);
    void deleteById(UUID beerId);
}
