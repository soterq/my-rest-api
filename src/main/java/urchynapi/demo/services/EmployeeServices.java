package urchynapi.demo.services;

import urchynapi.demo.domain.Employee;

import java.util.List;

public interface EmployeeServices {
    Employee findEmployeeById(Long id);

    List<Employee> findAllEmployees();

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Employee employee);

}
