package com.arwest.msscbrewery.web.controller.v2;

import com.arwest.msscbrewery.services.v2.BeerServiceV2;
import com.arwest.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/beer")
public class BeerControllerV2 {

    private final BeerServiceV2 beerServiceV2;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@NotNull @PathVariable UUID beerId){
        return new ResponseEntity<>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@Valid @NotNull @RequestBody BeerDtoV2 beerDto){
        val saveDtoV2 = beerServiceV2.saveNewBeer(beerDto);
        log.debug("handle post...");
        val headers = new HttpHeaders();
        //TODO: add hostname url
        headers.add("Location", "/api/v1/beer" + saveDtoV2.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable String beerId, @Valid @RequestBody BeerDtoV2 beerDto){
        beerServiceV2.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerServiceV2.deleteById(beerId);
    }

}
