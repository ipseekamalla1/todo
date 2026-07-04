package com.todo.repository;

import com.todo.entity.Priority;
import com.todo.entity.Status;
import com.todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    // 1. find by status (example: COMPLETED / PENDING)
    List<Task> findByStatus(Status status);

    // 2. find by priority (HIGH / LOW / MEDIUM)
    List<Task> findByPriority(Priority priority);

    // 3. find tasks by user id (IMPORTANT for relationships)
    List<Task> findByUserId(Long userId);

    // 4. search by title (LIKE query)
    List<Task> findByTitleContaining(String keyword);
}