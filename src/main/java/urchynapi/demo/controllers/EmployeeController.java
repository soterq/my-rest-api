package urchynapi.demo.controllers;

import org.springframework.web.bind.annotation.*;
import urchynapi.demo.domain.Employee;
import urchynapi.demo.services.EmployeeServices;

import java.util.List;

@RestController
@RequestMapping(EmployeeController.BASE_URL)
public class EmployeeController {
    private final EmployeeServices employeeServices;
    public static final String BASE_URL = "/api/employees";

    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    @GetMapping
    List<Employee> getAllEmployees() {
        return employeeServices.findAllEmployees();
    }

    @GetMapping("/{id}")
    Employee getEmployeeById(@PathVariable Long id) {
        return employeeServices.findEmployeeById(id);
    }

    @PostMapping
    Employee newEmployee(@RequestBody Employee employee){
       return employeeServices.saveEmployee(employee);
    }

}
