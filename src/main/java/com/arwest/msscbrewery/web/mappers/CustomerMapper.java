package com.arwest.msscbrewery.web.mappers;

import com.arwest.msscbrewery.domain.Customer;
import com.arwest.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer CustomerDtoToCustomer(CustomerDto customerDto);

}
