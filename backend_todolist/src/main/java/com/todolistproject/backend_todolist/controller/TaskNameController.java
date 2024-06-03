package com.todolistproject.backend_todolist.controller;

import com.todolistproject.backend_todolist.model.TaskName;
import com.todolistproject.backend_todolist.repository.TaskNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskNameController {
    @Autowired
    private TaskNameRepository repository;


    @PostMapping("/taskname")
    TaskName createTaskName(@RequestBody TaskName taskName) {

        return repository.save(taskName);
    }

    @GetMapping("/tasknames")
    List<TaskName> getAllTaskNames() {
        return TaskNameRepository.findAll();
    }
}
