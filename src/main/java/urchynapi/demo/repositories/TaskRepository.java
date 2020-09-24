package urchynapi.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import urchynapi.demo.domain.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
