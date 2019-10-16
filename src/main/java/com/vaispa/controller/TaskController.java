package com.vaispa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaispa.model.Task;
import com.vaispa.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	private final Logger log = LoggerFactory.getLogger(TaskController.class);
	private TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping(value = { "", "/" })
	public Iterable<Task> listTasks() {
		return taskService.list();
	}

	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task) {
		return taskService.save(task);
	}
}
