package urchynapi.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import urchynapi.demo.domain.Employee;
import urchynapi.demo.repositories.EmployeeRepository;
@Component
public class DatabaseLoader  implements CommandLineRunner {
    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
//        this.repository.save(new Employee("Sudo", "Admin", "super user"));
    }
}
