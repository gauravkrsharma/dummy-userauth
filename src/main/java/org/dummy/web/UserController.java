package org.dummy.web;

import org.dummy.model.DomainUser;
import org.dummy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping("/")
	@ResponseBody String generateHomePage()
	{
		return "Hello Anshul ! this is home page";
	}
	
	@RequestMapping("/users")
	@ResponseBody Iterable<DomainUser> getAllUsers()
	{
		return userService.listAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	@ResponseBody DomainUser getUserById(@PathVariable("id")Integer id)
	{
		return userService.getUserbyId(id);	
	}
	
	@RequestMapping(value = "users/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String insertUser(@RequestBody final DomainUser user) {
	    System.out.println(user.toString());
	    userService.saveUser(user);
	    String userAdded = "User-> {" + user.toString() + "} is added";
	    System.out.println(userAdded);
	        return userAdded;
	    }
		
		
}
