package com.user.userservice;

import java.util.Collection;
import java.util.List;

import com.user.model.User;

public interface UserService {
	

    
   public void saveUserinfo(User user);
   public List finduser();
   public User getoneuser(int id);
   public User updateusr(int id,User user);
   public Collection<User> getuserbymngr(String mngr_id);
public User authenticateUser(String username, String password);

   

}
