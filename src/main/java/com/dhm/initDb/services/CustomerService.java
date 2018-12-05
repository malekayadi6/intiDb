package com.dhm.initDb.services;

import com.dhm.initDb.repositories.CRM.entities.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService {

    public Customer addCustomer(Customer customer) ;
}
