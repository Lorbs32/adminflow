package dev.kylelohrberg.adminflow.repository;

import dev.kylelohrberg.adminflow.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
