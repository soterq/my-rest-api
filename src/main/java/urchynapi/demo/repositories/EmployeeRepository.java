package urchynapi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import urchynapi.demo.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}