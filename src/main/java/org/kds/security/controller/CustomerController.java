package org.kds.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.kds.security.config.SecConfig;
import org.kds.security.model.Customer;
import org.kds.security.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  The customer service API.
 */
@Slf4j
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getCustomers() {

        List<Customer> customers = customerService.getCustomers();
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }
}
