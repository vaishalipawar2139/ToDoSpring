package com.vaispa.service;

import org.springframework.stereotype.Service;

import com.vaispa.model.Task;
import com.vaispa.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

//	@Autowired
//	private TaskRepository taskRepository;

	private TaskRepository taskRepository;

	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public Iterable<Task> list() {
		return taskRepository.findAll();
	}

	@Override
	public Task save(Task task) {
		return taskRepository.save(task);
	}

}
