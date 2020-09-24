package urchynapi.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import urchynapi.demo.domain.Customer;
import urchynapi.demo.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) {

//        System.out.println("Loading Customer Data");
//        customerRepository.save(new Customer("Michael","West"));
//        System.out.println("Customer Saved: " + customerRepository.count());
    }
}
