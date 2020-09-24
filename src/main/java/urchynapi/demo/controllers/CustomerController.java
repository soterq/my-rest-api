package urchynapi.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import urchynapi.demo.domain.Customer;
import urchynapi.demo.services.CustomerServices;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final  String BASE_URL = "/api/customers";
    private final CustomerServices customerServices;

    public CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @GetMapping
    List<Customer> getAllCustomers(){
        return customerServices.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerServices.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerServices.saveCostumer(customer);
    }
}
