package com.nazjara.controller;

import com.nazjara.dto.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{id}")
    public ResponseEntity<BeerDto> get(@PathVariable UUID id) {
        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody @Valid BeerDto beer) {
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody @Valid BeerDto beer, @PathVariable UUID id) {
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}