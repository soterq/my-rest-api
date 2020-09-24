package urchynapi.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import urchynapi.demo.domain.Task;
import urchynapi.demo.enums.Severity;
import urchynapi.demo.repositories.TaskRepository;

import java.util.List;

@RestController
@RequestMapping(TaskController.BASE_URL)
public class TaskController {
    public static final String BASE_URL = "/api/tasks";
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/{id}")
    public Task findTaskById(@PathVariable Long id) {
        return taskRepository.findById(id).get();
    }

    @GetMapping
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task saveTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployee(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }

    @PostMapping("/{id}")
    public void changeDescription(@PathVariable Long id, String description) {
        if (!description.isEmpty()) {
            taskRepository.findById(id).get().setDescription(description);
        } else {
            taskRepository.findById(id).get().setDescription("");
        }

    }
    @PutMapping("/{id}")
    public void changeTitle(@PathVariable Long id, String title) {
        if (!title.isEmpty()) {
            taskRepository.findById(id).get().setTitle(title);
        } else {
            taskRepository.findById(id).get().setTitle("");
        }
    }

    @PostMapping("/{id}")
    public void changeSeverity(@PathVariable Long id, int severityLvl) {
            switch (severityLvl){
                case 1:
                    taskRepository.findById(id).get().setSeverity(Severity.MEDIUM);
                    break;
                case 2:
                    taskRepository.findById(id).get().setSeverity(Severity.HIGH);
                    break;
                default:
                    taskRepository.findById(id).get().setSeverity(Severity.LOW);
            }
    }

}
