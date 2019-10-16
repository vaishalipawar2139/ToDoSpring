package com.vaispa.service;

import com.vaispa.model.Task;

public interface TaskService {
	Iterable<Task> list(); 

	Task save(Task task);
}
