package com.MegaTask.demo.repository;

import com.MegaTask.demo.entity.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
