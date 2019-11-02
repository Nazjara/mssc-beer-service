package com.nazjara.controller;

import com.nazjara.dto.BeerDto;
import com.nazjara.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{id}")
    public ResponseEntity<BeerDto> get(@PathVariable UUID id) {
        return new ResponseEntity<>(beerService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody @Valid BeerDto beer) {
        return new ResponseEntity<>(beerService.save(beer), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody @Valid BeerDto beer, @PathVariable UUID id) {
        return new ResponseEntity<>(beerService.update(id, beer), HttpStatus.OK);
    }
}