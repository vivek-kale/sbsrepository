package com.user.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.model.UserTask;
import com.user.userrepository.TaskRepository;
import com.user.userservice.TaskService;


@Controller
@RestController
public class TaskController {
	
	 
    @Autowired
    private TaskService taskService;
    
    //create task
    @RequestMapping(method=RequestMethod.POST ,value="/api/user/{user_id}/task", consumes="application/json")
    public UserTask createtask(@PathVariable(value = "user_id") int user_id ,@RequestBody UserTask usertask)
    {
    usertask.setUser(new User(user_id,"","","","",""));
    	
	 taskService.saveTaskinfo(usertask);
		return usertask;
    	    
    }
    
    //update task
    @RequestMapping(method=RequestMethod.PUT ,value="/api/user/{user_id}/task/{task_Id}", consumes="application/json")
    public UserTask updatetask(@PathVariable(value="user_id") int user_id, @PathVariable(value="task_Id") int Id,@RequestBody UserTask usertask)
    {
		
    	usertask.setUser(new User(user_id,"","","","",""));
    	taskService.taskupdate(usertask);
    	return usertask;
    	
    	
    }
    
   
    
    
    //get task info
    @RequestMapping(method=RequestMethod.GET ,value="/api/user/{user_id}/task/{task_Id}", produces="application/json")
    public UserTask getTaskInfo(@PathVariable(value="user_id") int user_id, @PathVariable(value="task_Id") String  id) 
    {
		return taskService.getonetask(id);
    	
    }
    
    
    //get all task
    @RequestMapping(method=RequestMethod.GET ,value="api/user/{user_id}/task", produces="application/json")
    public List<UserTask> getAlltsk(@PathVariable(value = "user_id") int id)
   {
    
    	return (List) taskService.alltask(id);
	
    	
    	
    }
    }
    
    


