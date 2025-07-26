package dev.kylelohrberg.adminflow.repository;

import dev.kylelohrberg.adminflow.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
