package com.arwest.msscbrewery.web.mappers;

import com.arwest.msscbrewery.domain.Beer;
import com.arwest.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
