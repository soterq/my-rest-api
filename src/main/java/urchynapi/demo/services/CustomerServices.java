package urchynapi.demo.services;

import urchynapi.demo.domain.Customer;

import java.util.List;

public interface CustomerServices {

    Customer  findCustomerById(Long id);
    List<Customer> findAllCustomers();

    Customer saveCostumer(Customer customer);
}
