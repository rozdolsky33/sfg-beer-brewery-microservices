package com.arwest.msscbrewery.services.impl.v2impl;

import com.arwest.msscbrewery.services.v2.BeerServiceV2;
import com.arwest.msscbrewery.web.model.BeerDto;
import com.arwest.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public void updateBeer(String beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
