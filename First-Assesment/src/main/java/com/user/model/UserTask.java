package com.user.model;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usertask")
public class UserTask {

	@Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
	String id;
	String taskname;
	String description;
@ManyToOne
 public User user;
	
public UserTask(String id, String taskname, String description, int user_id) {
	super();
	this.id = id;
	this.taskname = taskname;
	this.description = description;
	this.user = new User(user_id,"","","","","");
	
}

	
	public UserTask()
	{}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

//	public void setUser(User user2) {
//		// TODO Auto-generated method stub
//		
//	}

	

	
	

}
