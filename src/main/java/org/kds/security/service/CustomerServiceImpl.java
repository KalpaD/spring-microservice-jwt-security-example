package org.kds.security.service;

import org.kds.security.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     *  Just a dummy getCustomer service to generate some data.
     *
     * @return List of {@link Customer}s
     */
    @Override
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();

        Customer customer_1 = new Customer();
        customer_1.setFname("John");
        customer_1.setLname("Doe");
        customer_1.setAddress("Sydney, 2000");

        Customer customer_2 = new Customer();
        customer_2.setFname("Jane");
        customer_2.setLname("Doe");
        customer_2.setAddress("New York, 1453");

        Customer customer_3 = new Customer();
        customer_3.setFname("Paul");
        customer_3.setLname("Jay");
        customer_3.setAddress("Paris, 5644");

        return Arrays.asList(customer_1, customer_2, customer_3);
    }
}
