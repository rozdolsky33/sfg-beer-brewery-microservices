package com.arwest.msscbrewery.services.impl;

import com.arwest.msscbrewery.services.CustomerService;
import com.arwest.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID beerId) {
        return CustomerDto.builder().id(beerId).customerName("John Doe").build();


    }
}
