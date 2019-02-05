package com.kodilla.hibernate2.task.dao;

import com.kodilla.hibernate2.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task,Integer> {
    List<Task> findByDuration(int duration);
}
