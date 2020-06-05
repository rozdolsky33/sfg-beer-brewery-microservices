package com.arwest.msscbrewery.services;

import com.arwest.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID beerId);
}

