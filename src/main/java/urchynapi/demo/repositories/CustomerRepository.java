package urchynapi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import urchynapi.demo.domain.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {

}
