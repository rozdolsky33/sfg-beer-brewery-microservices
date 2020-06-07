package com.arwest.msscbrewery.services.impl.v2impl;

import com.arwest.msscbrewery.services.v2.BeerServiceV2;
import com.arwest.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(@Valid BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(String beerId, @Valid BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
