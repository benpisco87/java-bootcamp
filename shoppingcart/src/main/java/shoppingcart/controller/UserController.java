package shoppingcart.controller;

import java.lang.invoke.MethodType;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import shoppingcart.service.UserService;
import shoppingcart.model.*;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map)
	{
		User user = new User();
		map.put("user", user);
		map.put("userList", userService.getAllUser());
		return "user";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public <type> void addUser(@RequestParam String name)
	{
		User userResult = new User();
		userResult.setUserName(name);
		userService.add(userResult);
		
		
	}
	
	
	
	
	
	
	
	
	
	/*@RequestMapping(value="/user", method=RequestMethod.POST)
	public String doActions(@ModelAttribute User user, BindingResult result, @RequestParam String action, Map<String, Object> map)
	{
		User userResult = new User();
		if (action.equalsIgnoreCase("add"))
		{
			userService.add(user);
			userResult = user;
		}	
		
		return "ok";
		else if (action.equalsIgnoreCase("edit"))
		{
			userService.edit(user);
			userResult = user;
		}
		else if (action.equalsIgnoreCase("delete"))
		{	userService.delete(user.getId());
			userResult = new User();
		}
		else
		if (action.equalsIgnoreCase("search"))
		{
			User searchedUser = userService.getUser(user.getId());
			userResult = searchedUser !=null ? searchedUser : new User();
		}
		map.put("user", userResult);
		map.put("userList", userService.getAllUser());
		return "user";
	}*/


	
}
