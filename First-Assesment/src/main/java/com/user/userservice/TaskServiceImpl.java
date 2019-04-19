package com.user.userservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.model.UserTask;
import com.user.userrepository.TaskRepository;
import com.user.userrepository.UserRepository;
@Service
public class TaskServiceImpl implements TaskService {
	
@Autowired
private TaskRepository taskRepository;

@Autowired
private UserRepository userRepository;
	
@Override
	
	
	public void saveTaskinfo(UserTask usertask) {
		
			taskRepository.save(usertask);
			
		
	}

	@Override
	public void taskupdate(UserTask usertask) {
		// TODO Auto-generated method stub
		taskRepository.save(usertask);
		
	}
	
	public List<UserTask> alltask(int id) {
		List<UserTask> task=new ArrayList<>();
		 task=taskRepository.findByUserId(id);
		
		return (List) task;
		
		
	}

	@Override
	public UserTask getonetask(String id) {
		// TODO Auto-generated method stub
		
		return taskRepository.findById(id);
		
			
			
		}
		
		
	}

	


