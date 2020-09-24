package urchynapi.demo.services;

import org.springframework.stereotype.Service;
import urchynapi.demo.domain.Customer;
import urchynapi.demo.repositories.CustomerRepository;

import java.util.List;
@Service
public class CustomerServicesImpl implements CustomerServices {

    private final CustomerRepository customerRepository;

    public CustomerServicesImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCostumer(Customer customer) {
        return customerRepository.save(customer);
    }


}
