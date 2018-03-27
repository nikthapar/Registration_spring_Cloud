package com.springboot.login.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	
	
	@Autowired
	private LoginProxy obj1;
	
	@GetMapping("/registration/username/{username}/password/{password}")
	public String Registration(@PathVariable String username , @PathVariable String password) {
		String temp = obj1.CheckLogin(username, password);
		return temp;
	}
}
