package urchynapi.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import urchynapi.demo.domain.Task;
import urchynapi.demo.enums.Severity;
import urchynapi.demo.repositories.TaskRepository;
@Component
public class TaskLoader  implements CommandLineRunner {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskLoader(TaskRepository repository) {
        this.taskRepository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
//        System.out.println("Loading Task Data");
//
//        taskRepository.save(new Task("Make my job", "Go to office and code...", Severity.LOW));
//
//        taskRepository.save(new Task("QA test", "Go to office and test code...", Severity.MEDIUM));
//
//        taskRepository.save(new Task("PM", "Go to office and Manage Code...", Severity.HIGH));
//
//        System.out.println("Customer Saved: " + taskRepository.count());
    }
}
