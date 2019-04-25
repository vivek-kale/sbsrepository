package com.user.usercontroller;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.user.model.User;
import com.user.userservice.UserService;


@Controller
@RestController
public class UserController {    
	private static final int User = 0;
	@Autowired
    private UserService userService;
    
    //create user
    
    @RequestMapping(method=RequestMethod.POST ,value="/api/user",consumes="application/json")
    public User create(@RequestBody User user)
    {
	 
	  userService.saveUserinfo(user);
		return user;
    }
    
    //Update user
    
    @RequestMapping(method=RequestMethod.PUT ,value="/api/user/{id}",consumes="application/json")
    public User updateuser(@PathVariable(value = "id") int Id,@RequestBody User user) {

      
         return userService.updateusr(Id,user);
       
    }
    
    //Get one user Info
    @RequestMapping(method=RequestMethod.GET, value="/api/user/{id}")
    public User getUserInfo(@PathVariable(value = "id") int id)
    {
    	
		return userService.getoneuser(id);
    	
    	
    }
//get user by reporting mngr
    @RequestMapping(method=RequestMethod.GET, value="/api/user/report/{mngr_id}",produces="application/json")
    public Collection<User> getUserbyreportingmngr(@PathVariable(value = "mngr_id") String mngrid)
    {
    	
		return  userService.getuserbymngr(mngrid);
    	
    	
    }  
    
    //Get all user
    @RequestMapping(method=RequestMethod.GET ,value="/api/user",produces="application/json")
    public List<User> findAll(){
    	  
    	return (List) userService.finduser();
    	
   
    	}


    @RequestMapping(method=RequestMethod.POST ,value="/api/user/login")
    public User authenticate(@RequestParam(value="username") String username,@RequestParam(value="password") String password)
    {
    	
    	
    	User user = userService.authenticateUser(username, password);
    	
    	return user;
    }
    
       
    
    
    

    
   
}
