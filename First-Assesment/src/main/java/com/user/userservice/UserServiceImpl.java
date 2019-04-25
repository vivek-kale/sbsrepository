package com.user.userservice;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.userrepository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
public void saveUserinfo(User user) {
		
		// TODO Auto-generated method stub
	user=userRepository.save(user);
		
	}


public List finduser() {
return userRepository.findAll();
}


@Override
public User updateusr(int id,User user) {
	return userRepository.save(user);
}


@Override
public User getoneuser(int id) {
	// TODO Auto-generated method stub
return	userRepository.findById(id);
	
}


@Override
public Collection<User> getuserbymngr(String mngrid) {
	// TODO Auto-generated method stub
	return  userRepository.findByMngrid(mngrid);
}


@Override
public User authenticateUser(String username, String password) {
	User user=new User();
	user = userRepository.findByUsername(username);
    if (user == null) {
    	user = new User();
    	user.setUsername(username);
    	user.setPassword(password);
    	user.setLogin_Status("user_Not_Found");
    } else {
    		if(user.getPassword().equalsIgnoreCase(password)) {
    			user.setLogin_Status("login_success");
    		} else
    		{
    			user.setLogin_Status("login_fail");
    		}
	}
	// TODO Auto-generated method stub
	return user;
}

	


}
