package com.user.userrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.UserTask;

public interface TaskRepository extends JpaRepository<UserTask, Integer> {
	
	List<UserTask> findByUserId(int id);

	UserTask findById(String id);


	

}
