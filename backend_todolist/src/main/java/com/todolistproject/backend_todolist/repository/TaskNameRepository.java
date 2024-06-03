package com.todolistproject.backend_todolist.repository;

import com.todolistproject.backend_todolist.model.TaskName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskNameRepository extends JpaRepository<TaskName, Integer> {

}
