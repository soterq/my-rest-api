package urchynapi.demo.services;

import org.springframework.stereotype.Service;
import urchynapi.demo.domain.Employee;
import urchynapi.demo.repositories.EmployeeRepository;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeServices {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}
