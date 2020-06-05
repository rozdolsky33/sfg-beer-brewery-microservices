package com.arwest.msscbrewery.services;

import com.arwest.msscbrewery.web.model.BeerDto;
import com.arwest.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID beerId);
    CustomerDto saveNewCustomer(CustomerDto customerDto);
    void updateCustomer(String customerId, BeerDto beerDto);
    void deleteById(UUID customerId);
}

