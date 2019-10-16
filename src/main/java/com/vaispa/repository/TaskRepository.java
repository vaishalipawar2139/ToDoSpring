package com.vaispa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vaispa.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

}
