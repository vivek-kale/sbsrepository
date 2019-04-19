package com.user.userservice;

import java.util.List;

import com.user.model.UserTask;

public interface TaskService {
	public void saveTaskinfo(UserTask usertask);
	public void taskupdate(UserTask usertask);
	public UserTask getonetask(String id);
	public List<UserTask> alltask(int id);
	
}
