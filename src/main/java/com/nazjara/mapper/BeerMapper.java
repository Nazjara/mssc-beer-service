package com.nazjara.mapper;

import com.nazjara.model.BeerDto;
import com.nazjara.model.Beer;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
    BeerDto beerToBeerDtoWithInventory(Beer beer);
}