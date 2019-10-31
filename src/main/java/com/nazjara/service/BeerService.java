package com.nazjara.service;

import com.nazjara.dto.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID id);
    BeerDto save(BeerDto beer);
    BeerDto update(UUID id, BeerDto beer);
}
