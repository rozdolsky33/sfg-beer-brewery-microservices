package com.arwest.msscbrewery.services.impl;

import com.arwest.msscbrewery.services.CustomerService;
import com.arwest.msscbrewery.web.model.BeerDto;
import com.arwest.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID beerId) {
        return CustomerDto.builder().id(beerId).customerName("John Doe").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(String customerId, BeerDto beerDto) {
        //TODO: impl -  would add a real impl to update
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting Customer...");
    }
}
