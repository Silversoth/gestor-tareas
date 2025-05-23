package com.github.silversoth.gestor_tareas.dao;

import com.github.silversoth.gestor_tareas.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
