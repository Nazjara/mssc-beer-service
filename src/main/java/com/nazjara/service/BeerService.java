package com.nazjara.service;

import com.nazjara.dto.BeerDto;
import com.nazjara.dto.BeerPagedList;
import com.nazjara.dto.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID id);
    BeerDto save(BeerDto beer);
    BeerDto update(UUID id, BeerDto beer);

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);
}
